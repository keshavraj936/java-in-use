public class inheritance {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Oragnism oragnism = new Oragnism();
        Plant plant =new Plant();

        System.out.println(oragnism.isAlive);
        System.out.println(oragnism.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        plant.photosynthesis();

        dog.eat();
        dog.speak();

        cat.eat();
        cat.speak();


    }
}
