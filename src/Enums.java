import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {

        //Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String response = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(response);

        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURUDAY,
                 FRIDAY -> System.out.println("It is a weekday");

            case SATURDAY,
                 SUNDAY -> System.out.println("It a weekend");

        }

    }
}
