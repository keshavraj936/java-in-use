import java.util.Scanner;
    public class do_while {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int age = 0;

            do{
                System.out.println("Your age can't be negative");
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
            }   while(age<0);

            System.out.println("You are " + age + " Years old");
        }
}
