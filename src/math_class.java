import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {
        /*
        System.out.println(Math.PI);

        System.out.println(Math.E);

        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.13);
        result = Math.ceil(3.14);
        result = Math.floor(3.8);
        result = Math.max(10,20);
        result = Math.min(20,30);

        System.out.println(result);
        */

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter Side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter Side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("The Hypotenuse is: " + c);

        scanner.close();

    }
}
