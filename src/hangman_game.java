import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman_game {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String filePath = "C:\\Users\\THIS SUCKs\\IdeaProjects\\MY FIRST PROJECT\\src\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }

        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't file found");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();

        int wrongGuesses = 0;

        for(int i = 0; i< word.length(); i++){
            wordState.add('_');
        }

        System.out.println("Welcome to Java Hangman!");

        while (wrongGuesses < 6){

            System.out.println(getHangManArt(wrongGuesses));

            System.out.print("Word: ");

            for (char c : wordState){
                System.out.print(c + " " );
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess\n");

                for(int i = 0 ; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);

                    }
                }

                if (!wordState.contains('_')){
                    System.out.println(getHangManArt(wrongGuesses));
                    System.out.println("You win");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else{
                wrongGuesses++;
                System.out.println("Wrong Guess\n");
            }
        }

        if(wrongGuesses >= 6){
            System.out.println(getHangManArt(wrongGuesses));
            System.out.println("GAME OVER");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    static String getHangManArt (int wrongGuesses){

        return switch (wrongGuesses){
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                        
                      """;
            case 3 -> """
                       o
                      /|
                      
                      """;
            case 4 -> """
                       o
                      /|\\
                                        
                      """;
            case 5 -> """
                       o
                      /|\\
                       /                 
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\                 
                      """;
            default -> " ";

        };


    }
}
