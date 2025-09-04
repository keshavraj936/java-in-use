import java.util.Scanner;


public class user_input {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false) : ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your GPA is " + gpa);
        System.out.println("Student "+ isStudent);


        scanner.close();

    }
}
