import java.awt.image.ImageProducer;
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        //Generics - A concept where you can write a class, interface, or method
        //           that is compatible with different data types.
        //           <T> type parameter (placeholder that gets replaced with a real type
        //           <String> type argument (specifies the type)

        Box<String> box = new Box<>();

        box.setItem("Banana");
       // System.out.println(box.getItem());


        Product<String, Double> product = new Product<>("apple", 0.50);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());









    }
}
