public class array_of_objects {
    public static void main(String[] args) {

        Car_ car1 = new Car_("Mustang", "Red");
        Car_ car2 = new Car_("Y", "White");
        Car_ car3= new Car_("GT", "Yellow");


        Car_[] cars = { car1, car2, car3};



        for (Car_ car : cars) {
            car.drive();
        }

    }
}
