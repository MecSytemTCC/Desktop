package mecsystem.Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class Company {
    private int idCompany;
    private String CPNJ;
    private String StreetName;
    private String NumberCompany;
    private String NameCompany;
    Connection con = new Connection();

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getCPNJ() {
        return CPNJ;
    }

    public void setCPNJ(String CPNJ) {
        this.CPNJ = CPNJ;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public String getNumberCompany() {
        return NumberCompany;
    }

    public void setNumberCompany(String NumberCompany) {
        this.NumberCompany = NumberCompany;
    }

    public String getNameCompany() {
        return NameCompany;
    }

    public void setNameCompany(String NameCompany) {
        this.NameCompany = NameCompany;
    }
    
    public void ReadById(){
        ResultSet rs = null;
        java.sql.Connection conect = null;
        conect = con.getConexao();
        String sql = "SELECT * FROM tb_company WHERE idtb_company = ?";
        PreparedStatement stm;
        try {
            stm = conect.prepareStatement(sql);
            stm.setInt(1, this.idCompany);
            rs = stm.executeQuery();
            while(rs.next()){
                this.idCompany = rs.getInt("idtb_company");
                this.CPNJ = rs.getString("CNPJ");
                this.NameCompany = rs.getString("CompanyName");
                String[] Address = rs.getString("Address").split(", ");
                this.NumberCompany = Address[0];
                this.StreetName = Address[1];
            }
        } catch (SQLException ex) {
            System.out.println("Não Consultou"
                    + ex.getMessage());
        }
        
        
        
    } 
    
    public Boolean Create(){
            String sql = "INSERT INTO tb_company ( `idtb_company`, `CNPJ`, `Address`, `CompanyName`) VALUES (1, ?, ?, ?)";
            PreparedStatement stm;
            try {
                stm = con.getConexao().prepareStatement(sql);
                stm.setString(1, this.CPNJ);
                stm.setString(2, this.NumberCompany + ", "+ this.StreetName);
                stm.setString(3, this.NameCompany);
                stm.execute();
                return true;
            }catch (SQLException ex){
                return false;
            }
    }
    
    public boolean isCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
    if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
       (CNPJ.length() != 14))
       return(false);
 
    
    
    
    char dig13, dig14;
    int sm, i, r, num, peso;
 
// "try" - protege o código para eventuais erros de conversao de tipo (int)
    try {
// Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=11; i>=0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
        num = (int)(CNPJ.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }
 
      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig13 = '0';
      else dig13 = (char)((11-r) + 48);
 
// Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=12; i>=0; i--) {
        num = (int)(CNPJ.charAt(i)- 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }
 
      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig14 = '0';
      else dig14 = (char)((11-r) + 48);
 
// Verifica se os dígitos calculados conferem com os dígitos informados.
      if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }
}
