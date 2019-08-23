
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        // create new account
        Account raphaelsAccount = new Account("Raphael", 100.0);
        
        // deposit to account
        raphaelsAccount.deposit(20.0);
        
        //print acount balance
        System.out.println(raphaelsAccount);
        
    }

}
