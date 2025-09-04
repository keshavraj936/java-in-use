public class string_methods {
    public static void main(String[] args) {

        String name = "PAssWord";

        // int length = name.length();
        // char letter = name.charAt(4);
        // int index = name.indexOf(" ");
        // int LastIndex = name.lastIndexOf("a");

       // name = name.toUpperCase(); //also toLowerCase();

       // name = name.trim();

        //name = name.replace("a","k");

        //name.isEmpty(); returns boolean either string is present or not

        /*
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(LastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());
        */

        /*
        if(name.isEmpty()){
            System.out.println("Please Enter your name");
        }else {
            System.out.printf("Hello %s",name);
            System.out.println();
        }

        if(name.contains(" ")){
            System.out.println("Your name contains space");
        }
        else{
            System.out.println("Your name doesn't contains space");
        }
         */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
