public class abstraction {
    public static void main(String[] args) {
        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes Can't be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain ;concrete' methods (which are inherited)



        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(5, 3);
        Rectangle rectangle= new Rectangle(4, 5);


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());





    }
}
