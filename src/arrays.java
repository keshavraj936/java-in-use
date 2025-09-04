import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        //array = collection of values of same data type

        String[] fruits = {"apple", "orange", "coconut"};

       // fruit[0] = "pineapple";

       // int numOfFruits = fruits.length;

        //for(int i = 0 ; i < numOfFruits ; i++){
        //    System.out.println(fruits[i]);
        //}

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }




    }
}
