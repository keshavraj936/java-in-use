import java.util.Scanner;

public class sub_strings {
    public static void main(String[] args) {
        // .substring = A method used to extract a portion of a string
        // .substring(Start,end)

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter tour Email: ");
        String email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Your email is fake");
        }



        scanner.close();
    }
}
