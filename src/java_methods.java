public class java_methods {
    public static void main(String[] args) {

        //method = a block of reusuable code that is executed when called ()

        String name = "Bro";
        int age = 25;

        happyBirthday(name,age);
        happyBirthday(name,age);
        happyBirthday(name,age);
    }

    static void happyBirthday(String name, int age){
        System.out.printf("Happy Birthday %s\n", name);
        System.out.printf("You are %d now\n", age);
    }
}
