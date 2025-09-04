public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part of" relationship between objects
        //               For example, an Engine is "part of" a car
        //               Allows complex objects to be constructed from smaller objects


        Car3 car3 = new Car3("Corvette", 2025, "V8");



        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.engine);
    }
}
