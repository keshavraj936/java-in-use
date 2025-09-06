import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Alarm_Clock {
    public static void main(String[] args) {

        //JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\THIS SUCKs\\IdeaProjects\\JAVA\\src\\A Caring Friend - Bad Snacks.wav";

        while(alarmTime == null){
            try{
                System.out.print("Enter an alarm time (HH:mm:SS): ");
                String inputTime = scanner.nextLine();


                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);

            }
            catch (DateTimeParseException e){
                System.out.println("Invalid Input");

            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();


    }
}
