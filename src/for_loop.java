import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code for a certain amount of times

        Scanner scanner = new Scanner(System.in);
        System.out.print("How may seconds you want to countdown: ");
        int start = scanner.nextInt();

        for(int i = start; i>0 ; i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR");
    }
}
