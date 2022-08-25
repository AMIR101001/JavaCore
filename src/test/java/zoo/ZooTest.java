package zoo;

import org.junit.Assert;
import org.junit.Test;

public class ZooTest {
    @Test
    public void average_cost() {
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
        double average_money = Zoo.average_cost();
        System.out.println(average_money);
        Assert.assertEquals(average_money, 268.75, 0.01);
    }

    @Test
    public void many_animals(){
        Zoo ufa = new Zoo(
                2150,
                "ufa",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("пингвин"),
                        new Animal("осел")
                }

        );
        Zoo piter = new Zoo(
                2150,
                "piter",
                new Animal[]{
                        new Animal("жираф"),
                        new Animal("ферблюд"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("осел")
                }

        );
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
                        new Animal("осел"),
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
                        new Animal("осел"),
                        new Animal("слон"),
                        new Animal("цапля"),
                        new Animal("осел")
                }
                );
        Zoo[] zoos = {ufa, piter, kazan, moskow, samara};
        System.out.println(Zoo.get_more_animals().toString());
        Assert.assertEquals("Zoo{name='moskow'}", Zoo.get_more_animals().toString());
    }

}