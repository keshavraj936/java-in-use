public class Operators {
    public static void main(String[] args) {
        // Arithmatic Operators

        int x = 10;
        int y = 2;
        int z;

        /* Arithmetic operators
        z = x + y;
        z = x - y;
        z = x * y;
        z = x /y ;
        z = x % y; */

        // Augumented Assignment Operators
       // x = x + y;

        x += y; //this is augumented assignment operators
        x -= y; //this is augumented assignment operators
        x *= y; //this is augumented assignment operators
        x /= y; //this is augumented assignment operators

        // Increment and Decrement Operators

        // x+=1;  // OR x++;
        //x-=1; // or x--;

        // Order of operations [P-E-M-D-A-S]
        // parenthesis - Exponent - multiplication - Division - Addition - Substration


        double result = 3 +4 * (7-5)  / 2.0;

        System.out.println(result);


        System.out.println(x);

    }
}
