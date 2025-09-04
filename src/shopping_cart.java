import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {

        //Shopping
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each quantity?: ");
        price = scanner.nextDouble();

        System.out.print("how many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.print("Your total cost is "+ currency + total);









        scanner.close();
    }
}
