import java.util.Scanner;
// if we use int before string there is a condition called input buffer and use integer input as string output

public class int_before_string {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("you are " + age + " years old");
        System.out.println("Your name is " + name);

        scanner.close();

    }
}
