package task.pair;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.UUID;

public class KeyServiceTest {
    @Test
    public void getHash() {
        KeyService keyService = new KeyService();
        String generateKeyFirst = "efb70671-9b0d-4763-a9cf-dd6165a873ee";
        String generateKeySecond = "88e44e41-176f-4caf-94d3-f618caf6147c";
        // 7067190476396165873 + 88444117649436186147 = 706719047639616587388444117649436186147
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);
        BigInteger result = keyService.getHash(pair);
        BigInteger expected = new BigInteger("706719047639616587388444117649436186147");
        Assert.assertEquals(null, result);
    }

    @Test
    public void correctHash(){
        KeyService keyService = new KeyService();
        String generateKeyFirst = "0sdsdsds1sdsds-sds2-sd3-df-4dfd-5df-df";
        String generateKeySecond = "6-dfgdg-7vh-8-dfgdg9-fgh";
        // 7067190476396165873 + 88444117649436186147 = 706719047639616587388444117649436186147
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);
        BigInteger result = keyService.getHash(pair);
        BigInteger expected = new BigInteger("0123456789");
        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void whenNull() {
        KeyService keyService = new KeyService();
        Pair pair = Pair.of(null, "sdfsdf");
    }


}