public class SecondArrayTask {
    public static int fullSize(int[] firstArray, int[] secondArray) {
        int count_arr = 0;
        int count_arr2 = 0;

        for(int arr : firstArray){
            count_arr++;
        }

        for(int arr : secondArray){
            count_arr2++;
        }
        return count_arr + count_arr2;
    }
}
