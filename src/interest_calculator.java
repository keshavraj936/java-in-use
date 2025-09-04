import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount;
        double principal;
        double rate;
        int year;
        int timesCompunded;

        System.out.print("Enter Principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter Interest Rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter Year: ");
        year = scanner.nextInt();

        System.out.print("Enter No of times interest Compounded: ");
        timesCompunded = scanner.nextInt();

        amount = principal * (Math.pow((1 + rate/timesCompunded),year * timesCompunded));

        System.out.printf("Enter Interest) Rate: %.3f", amount);









        scanner.close();

    }
}
