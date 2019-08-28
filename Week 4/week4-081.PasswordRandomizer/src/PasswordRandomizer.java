import java.util.Random;

public class PasswordRandomizer {
    private String passwordOptions = "abcdefghijklmnopqrstuvwxyz";
    private int passwordLength;
    Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
    }

    public String createPassword() {
        String generatedPassword = "";
 
        while (true) {
            if (generatedPassword.length() > this.passwordLength - 1) {
                break;
            }
            char singleChar = this.passwordOptions.charAt(randomizer.nextInt(passwordOptions.length()-1));
            generatedPassword += singleChar;
        }
        
        
        return generatedPassword;
    }
}
