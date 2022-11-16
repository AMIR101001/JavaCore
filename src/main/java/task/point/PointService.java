package task.point;

public class PointService {
    public double distance(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {

        return Math.sqrt((Math.pow(firstPointX, 2) - Math.pow(firstPointY, 2)) + (Math.pow(secondPointX, 2) - Math.pow(secondPointY, 2)));

    }
    public double distanceBetweenPoints(int a, int b){
            return Math.abs(a) - Math.abs(b);
    }
}
