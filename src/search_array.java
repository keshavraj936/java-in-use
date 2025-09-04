import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 7, 8, 4};
        String[] fruits = {
                "Apple", "Orange", "Mango", "Banana", "Grapes",
                "Pineapple", "Strawberry", "Watermelon", "Papaya", "Guava",
                "Kiwi", "Peach", "Cherry", "Blueberry", "Pomegranate",
                "Lemon", "Coconut", "Lychee", "Fig", "Dragonfruit"
        };
        int target = 2;
        System.out.print("Name a fruit you want to know about it's index: ");
        String target1 = scanner.nextLine();
        boolean isFound  = false;

        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(target1)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in array");
        }
    }
}
