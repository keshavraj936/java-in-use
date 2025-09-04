public class overloaded_methods_2 {
    public static void main(String[] args) {

        String pizza = bakePizza("Flat", "Mozzerella");
        System.out.println(pizza);

    }
    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread +" " + cheese + " pizza";
    }
}
