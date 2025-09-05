import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dates_and_times {
    public static void main(String[] args) {

        /*
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime= LocalDateTime.now();

        Instant instant = Instant.now();

        System.out.println(instant);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

         */

        // Custom Format

        /*
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

         */

        LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 25, 0, 0, 0);
        LocalDateTime dateTime2= LocalDateTime.of(2026, 1, 1, 0, 0, 0);
        System.out.println(dateTime2);
        System.out.println(dateTime1);

        if (dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2 );
        }


    }
}
