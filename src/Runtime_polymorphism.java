import java.util.Scanner;

public class Runtime_polymorphism {
    public static void main(String[] args) {


        //Runtime polymorphism = When the method that gets excuted is decided
        //                       at runtime based on the actual type of the object

        Scanner scanner = new Scanner(System.in);


        Animal1 animal1;

        System.out.print("Would you like a dog or cat?(1 = dog and 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal1 = new Dog1();
            animal1.speak();
        }
        else if(choice== 2){
            animal1 = new Cat1();
            animal1.speak();
        }

        scanner.close();





    }
}
