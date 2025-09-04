import java.util.Scanner;

public class enhanched_switches {
    public static void main(String[] args) {

        // Enchanced Switch - it is a replacement to mant else if statements
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day name:");

        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a week day");
            case "Saturday", "Sunday"-> System.out.println("It is weekend");
            default -> System.out.println(day + " is not a day");

        }
    }
}
