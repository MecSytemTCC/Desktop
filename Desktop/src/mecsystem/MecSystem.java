package mecsystem;



import Activitys.actLogin;
import mecsystem.Classes.Admin;
import mecsystem.Classes.Company;
import mecsystem.Classes.Connection;

public class MecSystem {

    public static void main(String[] args) {
        Connection con = new Connection();
        if (con.getConexao() != null) {
            System.out.println("Conectado");
        }
        Company c = new Company();
        c.setIdCompany(1);
        c.ReadById();
        Admin a = new Admin();
        if (c.getNameCompany() == null) {
            new Activitys.actFirstLogin().setVisible(true);
        } else {
            new actLogin().setVisible(true);
        }
    }

}
