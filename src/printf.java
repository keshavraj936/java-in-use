public class printf {

    public static void main(String[] args) {

        // printf() = is a method to format output
        // %[flags] [width] [.precision] [specifier-character]

        /*
        String name = "Keshav";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstletter);
        System.out.printf("You are %d years old\n", age );
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old",name,age);
         */

        /*

         */

        double price1 = 990.99;
        double price2 = 1000.15;
        double price3 = -540.01;
        //
        System.out.printf("% (.2f\n", price1);
        System.out.printf("% (.2f\n", price2);
        System.out.printf("% (.2f\n", price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 6;
        int id4 = 7890;

        System.out.printf("%(d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%(d\n",id4);

    }
}
