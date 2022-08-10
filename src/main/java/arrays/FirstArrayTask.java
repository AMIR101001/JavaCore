package arrays;

public class FirstArrayTask {

    public static int getCountEvenNumbers(int[] array) {
        int count = 0;
        for( int arr : array){
            if(arr % 2 == 0)
                count++;
        }
        return count;
    }
}
