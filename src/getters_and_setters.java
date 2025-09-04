public class getters_and_setters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITABLE


        Car2 car2 = new Car2("Charger", "Yellow", 10000);

        car2.setColor("Blue");
        car2.setPrice(5000);



        System.out.println(car2.getColor() + " " + car2.getModel() + " " + car2.getPrice());
    }
}
