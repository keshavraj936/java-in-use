public class method_overriding {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        //                   = implementation of a method that is already defined
        //                   = Allows for code reusability and give specific implementations

        Dogg dogg = new Dogg();
        Catt catt = new Catt();
        Fishh fishh = new Fishh();

        dogg.move();
        catt.move();
        fishh.move();
    }
}
