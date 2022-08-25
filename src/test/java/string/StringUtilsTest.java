package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public  void getTheBiggestStringFromArray() {
        String[] animals = {
                "Жираф, белка, тигр",
                "слон, ящерица, собака, кошка, цапля",
                "корова, бегемот, морж, пингвин",
                "сова, кукушка"
        };

        BigString bigString = StringUtils.getTheBiggestStringFromArray(animals);

        Assert.assertEquals(35, bigString.getLength());
        Assert.assertEquals("слон, ящерица, собака, кошка, цапля", bigString.getValue());
    }
}