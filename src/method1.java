public class method1 {
    public static void main(String[] args) {

        int age =20;
        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(fullName("Keshav", "Raj"));


        if(ageCheck(age)){
            System.out.println("You are eligible for credit card");
        }else {
            System.out.println("You aren't eligible for credit card");
        }
    }
    static double square(double number){return number * number;}
    static double cube(double number){return Math.pow(number,3);}

    static String fullName(String first, String last){return first + " " + last;}
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
}
