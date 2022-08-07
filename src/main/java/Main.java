public class Main {
   public static boolean isSuccess(int age){
       return age >= 18;
   }

    public static int get_success_ful_ages_count(int[] values) {
        int completen_result = 0;
        for(int value : values){
            if(Main.isSuccess(value)){
                completen_result++;
            }
        }
        return completen_result;
    }
}


