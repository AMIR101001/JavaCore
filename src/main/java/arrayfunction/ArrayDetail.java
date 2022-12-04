package arrayfunction;

import java.util.stream.IntStream;

public class ArrayDetail {
    private int firstElement;

    private int lastElement;

    private int [] arr;
    private int sumBetweenFirstAndLast;

    public void setArr(int[] arr){
        this.arr = arr;
    }

    public int getFirstElement() {
        return arr[0];
    }

    public void setFirstElement(int firstElement) {
        this.firstElement = firstElement;
    }

    public int getLastElement() {
        return arr[arr.length - 1];
    }

    public void setLastElement(int lastElement) {
        this.lastElement = lastElement;
    }

    public int getSumBetweenFirstAndLast() {
        return IntStream.of(arr).sum();
    }

    public void setSumBetweenFirstAndLast(int sumBetweenFirstAndLast) {
        this.sumBetweenFirstAndLast = sumBetweenFirstAndLast;
    }
}
