package polymorphism;

import junit.framework.TestCase;
import org.junit.Test;

public class CarTest {
    @Test
    public void getEngineTypeTest(){
        Car[] auto = {new Kia( new Engine(220, 120), 4, "Rio"),
                new Mercedes( new Engine(320, 180), 2, "Benz AMG GT 2"),
                new BMW( new Engine(240, 120), 4, "X2")};

        for(Car autos : auto){
            System.out.println(autos.getEngineType());
        }
    }

}