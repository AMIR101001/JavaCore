package zoo;

import org.junit.Assert;
import org.junit.Test;

public class ZooTest {
    @Test
    public void averageCost() {
        Zoo kazan = new Zoo(
                2150,
                "kazan",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("осел")
                }

        );

        Zoo moskow = new Zoo(
                2150,
                "moskow",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("осел")
                }

        );

        Zoo samara = new Zoo(
                2150,
                "samara",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("осел")
                }

        );

        Zoo[] zoos = {kazan, moskow, samara};
        double average_money = Zoo.averageCost();
        Assert.assertEquals(average_money, 716.66, 0.01);
    }
}