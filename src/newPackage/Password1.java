package newPackage;

import java.io.Console;

public class Password1 {

    public static void main(String[] args) {

        String password = "enigma";
        boolean validPassword;

        Console console = System.console();
        char[] letters = null;

        int attemptes = 3;

        while (attemptes-- != 0){
            console.format("Enter password: ");
            letters = console.readPassword();

            if (String.valueOf(letters).equals(password)){
                console.format("Correct Password!!!");
                break;
            }else {
                console.format("Incorrect password " + attemptes + " left\n");
                if (attemptes == 0){
                    console.printf("Limit attempts was used!!!\nNext try for 15 minutes\n");
                }
            }
        }
    }
}
