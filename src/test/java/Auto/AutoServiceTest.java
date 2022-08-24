package Auto;

import org.junit.Test;

import java.lang.reflect.Array;
import java.net.SocketOption;
import java.util.Arrays;

public class AutoServiceTest {

    Auto mercedes = new Auto("E", "Mercedes", 2, "avto");
    Auto kia = new Auto("optima", "Kia", 4, "mechanical");
    Auto lada = new Auto("Granta", "Lada", 4, "mechanical");
    Auto bmv = new Auto("X1", "BMV", 4, "mechanical");
    Auto bmvx2 = new Auto("X2", "BMV", 4, "avto");
    Auto[] autos = {mercedes, kia, lada, bmv, bmvx2};
    @Test
    public void getOnlyBmwCars() {
        AutoService autoService = new AutoService();
        Auto[] result_array = autoService.getOnlyBmwCars(autos);

    }
}