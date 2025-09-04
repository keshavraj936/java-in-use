import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylists {
    public static void main(String[] args) {

        /*
        // Arraylist = A resizeable array that stores objects (autoboxing)
        //             Array are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0);

        //fruits.set(0, "Pineapple");


        System.out.println(fruits.size());

        Collections.sort(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }
         */


        // EXERCISE
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1 ; i<= numOfFood ; i++){
            System.out.print("Enter Food #" + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        scanner.close();

    }
}
