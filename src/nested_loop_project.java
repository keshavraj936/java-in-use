import java.util.Scanner;

public class nested_loop_project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the no of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the no of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1; j <= columns; j++  ){
                System.out.print(symbol);
            }
            System.out.println();
        }


    }
}
