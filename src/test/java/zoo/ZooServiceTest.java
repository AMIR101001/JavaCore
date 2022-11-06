package zoo;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ZooServiceTest{
    @Test
    public void moreAnimal(){
        Zoo kazan = new Zoo(
                2150,
                "kazan",
                new Animal[]{
                        new Animal("жираф"),
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
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("цапля"),
                        new Animal("осел")
                }

        );

        Zoo ufa = new Zoo(
                2150,
                "ufa",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("осел")
                }

        );

        Zoo piter = new Zoo(
                2150,
                "piter",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("осел")
                }

        );

        Zoo[] zoos = {kazan, moskow, samara, ufa, piter};
        ZooService test = new ZooService();
        Zoo expectedZoo = test.moreAnimal(zoos);
        Assert.assertEquals(expectedZoo.toString(), "Zoo{name='samara'}");
    }

    @Test
    public void averagePrice() {
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
        ZooService service = new ZooService();
        double average_money = service.averagePrice(zoos);
        Assert.assertEquals(average_money, 716.66, 0.01);
    }

}