package mecsystem.Classes;

public class Employee extends User{
    private String name;
    private String lastname;
    private String RG;
    private String PIS;
    private String FunctionName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) {
        this.PIS = PIS;
    }

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }
    
    public boolean isPis(){
        char[] digit = this.PIS.toCharArray();
        int x1 = 3 * Character.getNumericValue(digit[0]);
        int x2 = 2 * Character.getNumericValue(digit[1]);
        int x3 = 9 * Character.getNumericValue(digit[2]);
        int x4 = 8 * Character.getNumericValue(digit[4]);
        int x5 = 7 * Character.getNumericValue(digit[5]);
        int x6 = 6 * Character.getNumericValue(digit[6]);
        int x7 = 5 * Character.getNumericValue(digit[7]);
        int x8 = 4 * Character.getNumericValue(digit[8]);
        int x9 = 3 * Character.getNumericValue(digit[10]);
        int x10 = 2 * Character.getNumericValue(digit[11]);
        
        int plus = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10;
        int divison = plus % 11;
        int minus = 11 - divison;
        if ((minus == 10)||(minus == 11)){
            minus = 0;
        }
        
        return (Character.getNumericValue(digit[13]) == minus);
        
    }
    
}
