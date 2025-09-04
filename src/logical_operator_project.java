import java.util.Scanner;
public class logical_operator_project {
    public static void main(String[] args) {

        Scanner scannner = new Scanner(System.in);

        // username must be between 4-12 characters
        //username must not contain space or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scannner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contains space or underscore");
        }
        else{
            System.out.println("Welcome " + username );
        }



        scannner.close();
    }
}
