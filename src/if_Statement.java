import java.sql.SQLOutput;
import java.util.Scanner;

public class if_Statement {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Group 1
        if(name.isEmpty()){
            System.out.println("You didn't entered your name");
        }
        else{
            System.out.println("Your name is: " + name);
        }

        //Group 2
        if(age>=65) {
            System.out.println("You are a senior");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age<0){
            System.out.println("You aren't born!");
        }
        else if(age == 0){
            System.out.println("You are a baby");
        }
        else {
            System.out.println("You are a children");
        }
        scanner.close();
    }
}
