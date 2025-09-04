import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weightType;
        double weight;
        double convertedWeight;

        System.out.print("Enter Your Weight type(lb or Kg): ");
        weightType = scanner.nextLine().toLowerCase().trim();


        if(weightType.contains("lb")){
            System.out.print("Enter your weight:");
            weight = scanner.nextDouble();
            convertedWeight = weight * 0.453592;
            System.out.print("Your weight in kg is " + convertedWeight);
        }
        else if(weightType.contains("kg")){
            System.out.print("Enter your weight:");
            weight = scanner.nextDouble();
            convertedWeight = weight / 0.453592;
            System.out.print("Your weight in lb is " + convertedWeight);
        }
        else {
            System.out.println("Invalid Weight Typpe");
        }
        scanner.close();
    }
}
