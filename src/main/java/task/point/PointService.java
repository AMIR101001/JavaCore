package task.point;

public class PointService {
    public double distancePointPlane(int x1, int x2, int y1, int y2) {

        return Math.sqrt((Math.pow(x1, 2) - Math.pow(x2, 2)) + (Math.pow(y1, 2) - Math.pow(y2, 2)));

    }
    public double distanceBetweenPoints(int x, int y){
            return Math.abs(x - y);
    }

    public double pointInSpace(int x1, int x2, int y1, int y2, int z1, int z2){
       return Math.sqrt( distancePointPlane(x1, x2, y1, y2) + (Math.pow(z1, 2) - Math.pow(z2, 2)));
    }
}
