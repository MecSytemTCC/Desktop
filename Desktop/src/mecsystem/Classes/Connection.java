package mecsystem.Classes;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection {
     java.sql.Connection conection = null;
    public java.sql.Connection getConexao(){
        String url ="jdbc:mysql://localhost/bd_mecsystem";
        String username= "root";
        String password = "";
        try{
           conection = DriverManager.getConnection(url, username, password);
            
        }catch(SQLException ex){
            System.err.println("Erro " + ex.getMessage());
        }
         return conection;   
    }
}
