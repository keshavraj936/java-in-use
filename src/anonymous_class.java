public class anonymous_class {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. Can't be reused
        //                   Add custom behaviour without having to create a new class
        //                   Often used for one time uses(TimerTask, Runnable, callbacks)

        Dog2 dog1 = new Dog2();

        Dog2 dog2 = new Dog2(){
          @Override
          void speak() {
              System.out.println("Scobby Doo says Ruh Roh");
          }
        };

        dog1.speak();
        dog2.speak();
    }
}
