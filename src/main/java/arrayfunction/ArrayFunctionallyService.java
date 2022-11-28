package arrayfunction;

public class ArrayFunctionallyService {

    private ArrayDetail arrayDetail = new ArrayDetail();
    public ArrayDetail getArrayByCriteria(int[] numbers) {
        arrayDetail.setArr(numbers);
        return arrayDetail;
    }

    public int getSumNumbersBetweenIndex(int[] numbers, int start, int end) {
        return 0;
    }
}
