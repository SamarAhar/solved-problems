public class accessmodifier {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "SamarAhar";
        myAcc.password = "abcd";
    }
}

class BankAccount{
    public String username;
    protected String password;
    // public void setPassword(String pwd){
    //     password = pwd;
    // }
}