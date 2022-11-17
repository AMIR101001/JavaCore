package task.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointServiceTest {
    @Test
    public void distanceBetweenPointsTest(){
        PointService pointService = new PointService();
       double distance = pointService.distanceBetweenPoints(10, 20);
        Assert.assertEquals(10.0 , distance, 0.0 );
    }

    @Test
    public void distancePointPlaneTest(){
        PointService pointService = new PointService();
        double distance = pointService.distancePointPlane(25, 12, 33,15);
        Assert.assertEquals(36.67 , distance, 0.01 );
    }

    @Test
    public void pointInSpaceTest(){
        PointService pointService = new PointService();
        double distance = pointService.pointInSpace(12, 13, 12, 2, 4, 3);
        Assert.assertEquals(4.20 , distance, 0.01 );
    }


}