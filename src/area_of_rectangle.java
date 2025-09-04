import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args){
        // Area of rectangle

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.print("The area of rectangle: " + area);

        scanner.close();


    }
}
