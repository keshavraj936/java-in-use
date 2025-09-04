public class Wrapper_classes {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object
        //                   Allows use of Collections Framework and static Utility Methods


        // Autoboxing
        //Integer a =123;
        //Double b =3.14;
        //Character c = '$';
        //Boolean d = true;
        //String e = "Pizza";

        //Unboxing primitive
        //int x = a;

/*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('$');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);
 */

        /*
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.13");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        String x = a + b + c + d;

        System.out.println(x);
         */

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));








    }
}
