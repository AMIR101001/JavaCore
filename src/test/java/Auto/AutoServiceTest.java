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

        Auto[] result_array = autoService.getOnlyBmwCars(autos);

        String auto_model = bmv.getBrand();

       Assert.assertEquals(auto_model, result_array[0].getBrand());

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

        Auto[] result_array = autoService.getSportCars(autos);
        Assert.assertEquals(2, result_array[0].getPassengers());
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

        Auto[] result_array = autoService.getOnlyAutomaticTypeCars(autos);
        Assert.assertEquals("avto", result_array[0].getTransmission());
    }

}