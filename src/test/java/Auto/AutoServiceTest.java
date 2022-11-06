package Auto;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.net.SocketOption;
import java.util.Arrays;

public class AutoServiceTest {


    @Test
    public void getOnlyBmwCars() {
        Auto mercedes = new Auto("E", "Mercedes", 2, "avto");
        Auto kia = new Auto("optima", "Kia", 4, "mechanical");
        Auto lada = new Auto("Granta", "Lada", 4, "mechanical");
        Auto bmv = new Auto("X1", "BMW", 4, "mechanical");
        Auto bmvx2 = new Auto("X2", "BMW", 4, "avto");

        Auto[] autos = {mercedes, kia, lada, bmv, bmvx2};

        AutoService autoService = new AutoService();

        Auto[] resultArray = autoService.getOnlyBmwCars(autos);

        String autoModel = bmv.getBrand();

       Assert.assertEquals(autoModel, resultArray[0].getBrand());

    }

    @Test
    public void getSportCars(){
        Auto mercedes = new Auto("E", "Mercedes", 2, "avto");
        Auto kia = new Auto("optima", "Kia", 4, "mechanical");
        Auto lada = new Auto("Granta", "Lada", 4, "mechanical");
        Auto bmv = new Auto("X1", "BMV", 4, "mechanical");
        Auto bmvx2 = new Auto("X2", "BMV", 4, "avto");

        Auto[] autos = {mercedes, kia, lada, bmv, bmvx2};

        AutoService autoService = new AutoService();

        Auto[] resultArray = autoService.getSportCars(autos);
        Assert.assertEquals(2, resultArray[0].getPassengers());
    }
    @Test
    public void getOnlyAutomaticTypeCars(){
        Auto mercedes = new Auto("E", "Mercedes", 2, "avto");
        Auto kia = new Auto("optima", "Kia", 4, "mechanical");
        Auto lada = new Auto("Granta", "Lada", 4, "mechanical");
        Auto bmv = new Auto("X1", "BMV", 4, "mechanical");
        Auto bmvx2 = new Auto("X2", "BMV", 4, "avto");

        Auto[] autos = {mercedes, kia, lada, bmv, bmvx2};

        AutoService autoService = new AutoService();

        Auto[] resultArray = autoService.getOnlyAutomaticTypeCars(autos);
        Assert.assertEquals("avto", resultArray[0].getTransmission());
    }

    @Test
    public void carComparisonBrand(){
        Auto mercedes = new Auto("E", "Mercedes", 2, "avto");
        Auto kia = new Auto("optima", "Kia", 4, "mechanical");
        Auto lada = new Auto("Granta", "Lada", 4, "mechanical");
        Auto bmv = new Auto("X1", "BMV", 4, "mechanical");
        Auto bmvx2 = new Auto("X2", "BMV", 4, "avto");
        Auto mercedesS1=  new Auto("S1", "Mercedes", 2, "avto");
        Auto mercedesS2 = new Auto("S2", "Mercedes", 2, "avto");
        Auto mercedesS3 = new Auto("S3", "Mercedes", 2, "avto");

        Auto[] autos = {mercedes, kia, lada, bmv, bmvx2, mercedesS1, mercedesS2, mercedesS3};

        AutoService autoService = new AutoService();
        Auto [] expectedCarMerc = autoService.getAutosByBrand(autos, "Mercedes");
        boolean expectedAutosBool = autoService.carComparisonBrand(expectedCarMerc,"Mercedes");
        Assert.assertTrue(expectedAutosBool);
        Assert.assertEquals(expectedCarMerc[0], autos[0]);
    }

}