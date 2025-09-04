

public class break_continue {
    public static void main(String[] args) {

        // break =break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)



        for(int i = 0; i<10; i++){

            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 0; i<10; i++){

            if(i == 5){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
