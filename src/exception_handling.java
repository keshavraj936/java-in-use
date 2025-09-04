import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {

        //Exception = An event that interrupts the normal flow of a program
        //            (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with try{} block
        //             try{}, catch{}, finally{}


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Enter a integer");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("THANK YOU!");
        }
    }
}
