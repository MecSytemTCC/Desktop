package mecsystem.Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Function {
    private int idFunction;
    private String CBO;
    private String FunctionName;
    Connection con = new Connection();

    public int getIdFunction() {
        return idFunction;
    }

    public void setIdFunction(int idFunction) {
        this.idFunction = idFunction;
    }

    public String getCBO() {
        return CBO;
    }

    public void setCBO(String CBO) {
        this.CBO = CBO;
    }

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }
    
    public Boolean Create() {
        String sql = "INSERT INTO tb_function ( `CBO`, `FunctionName`) VALUES (?, ?)";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setString(1, this.CBO);
            stm.setString(2, this.FunctionName);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Boolean Update() {
        String sql = "UPDATE tb_function SET CBO = ?, FunctionName = ? WHERE idtb_function = ?";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setString(1, this.CBO);
            stm.setString(2, this.FunctionName);
            stm.setInt(3, this.idFunction);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Boolean Delete() {
        String sql = "DELETE FROM `bd_mecsystem`.`tb_function` WHERE (`idtb_function` = ?);";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setInt(1, this.idFunction);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
    public ResultSet ReadAll() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_Function ";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
        return rs;
    }
    public ResultSet Read() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_Function WHERE FunctionName like ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, "%"+this.FunctionName+"%");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
        return rs;
    }
    
    public void ReadByCBO() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_function WHERE CBO = ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, this.CBO);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.idFunction = rs.getInt("idtb_function");
                this.FunctionName = rs.getString("FunctionName");
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
    }
    
    public void ReadByName() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_function WHERE FunctionName = ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, this.FunctionName);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.idFunction = rs.getInt("idtb_function");
                this.CBO = rs.getString("CBO");
                this.FunctionName = rs.getString("FunctionName");
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
    }
    
}
