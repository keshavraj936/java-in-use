public class _2d_arrays {
    public static void main(String[] args) {
        // 2d array = where each element is an array
        //            Useful for storing a matrix of data


        String[][] groceries = {{"apples", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[2][3] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
