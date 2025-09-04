import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min = 1;
        int max =100;
        int randomNumbers = random.nextInt(min,max);

        System.out.println("Number Guessing Number");
        System.out.printf("Guess a number between %d- %d\n",min,max);

        do{
            System.out.print("Enter a Guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if(guess < randomNumbers){
                System.out.println("TOO LOW");
            }
            else if (guess > randomNumbers) {
                System.out.println("TOO HIGH");
            }
            else{
                System.out.println("Correct The number was " + randomNumbers);
            }

        }while(guess != randomNumbers);

        
        System.out.println("You have won");
        System.out.println("You have attempted " + attempts + " times");

        scanner.close();
    }
}
