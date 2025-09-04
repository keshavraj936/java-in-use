public class polymorphism {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "Many"
        //                "MORPH" = "Shape"
        //                  Objects can identify as other objects.
        //                  Objects can be treated as objects of a common superclass

        Jeep jeep = new Jeep();
        Bike bike = new Bike();
        Boat boat = new Boat();


        Vehicle[] vehicles = {jeep, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
