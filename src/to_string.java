public class to_string {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //              Used to return a string representation of an object
        //              By default, it returns a hash code as a unique identifier
        //              It can be overridden to provide meaningful details

        Carr carr = new Carr("Ford", "Mustang", "White", 2025);

        System.out.println(carr);



    }
}
