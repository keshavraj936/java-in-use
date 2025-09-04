import java.util.Scanner;

public class java_quizz_game {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        String[] questions = { "What is the full form of RAM?",
                               "Which device is used to input data into a computer?",
                               "Which part of the computer is responsible for executing instructions?",
                               "What is the smallest unit of information in a computer?",
                               "Who is known as the Father of the Computer?"};

        String[][] options =   {{"1. Random Access Memory", "2. Read Access Memory",  "3. Readily Available Memory",  "4. Rapid Access Module"},
                                {"1. Printer",  "2. Monitor", "3. Keyboard", "4. Speaker"},
                                {"1. Hard Disk", "2. RAM", "3. CPU", "4. Motherboard"},
                                {"1. Byte", "2. Bit", "3. Kilobyte", "4. Megabyte"},
                                {"1. Alan Turing", "2. Blaise Pascal", "3. Charles Babbage", "4. John von Neumann"}};


        int[] answers = {1, 3, 3, 2, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner((System.in));

        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("******************************");

        for(int i = 0 ; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT!!!!!!!!!");
                score += 1;
            }else {
                System.out.println("WRONG!!!!!!!!!!!");
            }
        }

        System.out.println("Your final score is: "+ score);



        scanner.close();

    }
}
