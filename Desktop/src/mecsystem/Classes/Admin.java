package mecsystem.Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends User {

    private int idAdmin;
    private String LoginAdmin;
    Connection con = new Connection();

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLoginAdmin() {
        return LoginAdmin;
    }

    public void setLoginAdmin(String LoginAdmin) {
        this.LoginAdmin = LoginAdmin;
    }

    public Boolean Create() {
        String sql = "INSERT INTO tb_admin ( `AdminName`, `AdminPassword`, `CpfAdmin`) VALUES (?, ?, ?)";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setString(1, this.LoginAdmin);
            stm.setString(2, this.getPassword());
            stm.setString(3, this.getCPF());
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Boolean Update() {
        String sql = "UPDATE tb_admin SET CpfAdmin = ?, AdminName = ?, AdminPassword = ? WHERE idtb_admin = ?";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setString(1, this.getCPF());
            stm.setString(2, this.LoginAdmin);
            stm.setString(3, this.getPassword());
            stm.setInt(4, this.idAdmin);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Boolean Delete() {
        String sql = "DELETE FROM `bd_mecsystem`.`tb_admin` WHERE (`idtb_admin` = ?);";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setInt(1, this.idAdmin);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }


    
    
    public void doLoging() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_admin WHERE AdminName = ? and AdminPassword = ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, this.LoginAdmin);
            stm.setString(2, this.getPassword());
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setCPF(rs.getString("cpfAdmin"));
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
    }
    
    public ResultSet Read() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_admin WHERE AdminName like ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, "%"+this.LoginAdmin+"%");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
        return rs;
    }
    
    public void ReadByLogin() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_admin WHERE AdminName = ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, this.LoginAdmin);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setCPF(rs.getString("cpfAdmin"));
                this.setPassword(rs.getString("AdminPassword"));
                this.LoginAdmin = (rs.getString("AdminName"));
                this.idAdmin = (rs.getInt("idtb_admin"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
    }
    
    public int doCount() {
        ResultSet rs = null;
        int x = 0;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT COUNT(cpfAdmin) 'count' FROM bd_mecsystem.tb_admin;";
        PreparedStatement stm;
        try {
            
            stm = conect.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                x = rs.getInt("count");
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
        return x;
    }

}
