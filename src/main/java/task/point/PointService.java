package task.point;

public class PointService {
    public double distance(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {

        return Math.sqrt((Math.pow(firstPointX, 2) - Math.pow(firstPointY, 2)) + (Math.pow(secondPointX, 2) - Math.pow(secondPointY, 2)));

    }
}
