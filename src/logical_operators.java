public class logical_operators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        double temp = -20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("It's Sunny");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("It's not Sunny");
        }
        else if (temp >= 30 || temp < 0){
            System.out.println("The weather is bad");
        }


    }
}
