import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test_first(){
        int[] ages = new int [5];
        ages[0] = 18;
        ages[1] = 17;
        ages[2] = 25;
        ages[3] = 5;
        ages[4] = 30;
        int expected_result = 3;
        int result = Main.get_success_ful_ages_count(ages);
        Assert.assertEquals(expected_result, result);
    }
}