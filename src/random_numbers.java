import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {

        Random random = new Random();

    // we can generate int, double, boolean
        double number = random.nextDouble(1,7);

        System.out.println(number);
    }
}
