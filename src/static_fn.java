public class static_fn {
    public static void main(String[] args) {

        // static = makes a variable or method belong to the class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Mandy");
        Friend friend5 = new Friend("Historia");

        Friend.showFriend();


        System.out.println(Math.round(3.99));







    }
}
