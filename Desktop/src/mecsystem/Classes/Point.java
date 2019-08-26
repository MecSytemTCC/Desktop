package mecsystem.Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    
public class Point {
    private int Code;
    private String Locale;
    Connection con = new Connection();

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getLocale() {
        return Locale;
    }

    public void setLocale(String Locale) {
        this.Locale = Locale;
    }
    
    
    public Boolean Create(){
            String sql = "INSERT INTO tb_electronicpoint ( `idtb_electronicpoint`, `Locale`, `fk_company`) VALUES (?, ?, 1)";
            PreparedStatement stm;
            try {
                stm = con.getConexao().prepareStatement(sql);
                stm.setInt(1, this.Code);
                stm.setString(2, this.Locale);
                stm.execute();
                return true;
            }catch (SQLException ex){
                return false;
            }
    }
    
    public Boolean Update(int ActualId) {
        String sql = "UPDATE tb_electronicpoint SET idtb_electronicpoint = ?, Locale = ? WHERE idtb_electronicpoint = ?";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setInt(1, this.Code);
            stm.setString(2, this.Locale);
            stm.setInt(3, ActualId);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Boolean Delete() {
        String sql = "DELETE FROM `bd_mecsystem`.`tb_electronicpoint` WHERE (`idtb_electronicpoint` = ?);";
        PreparedStatement stm;
        try {
            stm = con.getConexao().prepareStatement(sql);
            stm.setInt(1, this.Code);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public ResultSet Read() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_electronicpoint WHERE locale like ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setString(1, "%"+this.Locale+"%");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
        return rs;
    }
    
    public void ReadByCode() {
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_electronicpoint WHERE idtb_electronicpoint = ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setInt(1, this.Code);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.Code = rs.getInt("idtb_electronicpoint");
                this.Locale = rs.getString("Locale");
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
    }
}
