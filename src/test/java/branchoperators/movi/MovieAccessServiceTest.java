package branchoperators.movi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {
    @Test
    public void firstTest(){
        for(int i = -1; i <= 25; i++){
            System.out.println(i + " " + MovieAccessService.accessMovie(i));
            if(i >= 18 && i <= 21){
                Assert.assertEquals("Rating R. Access is allowed.", MovieAccessService.accessMovie(i));
            }
            else if(i > 21){
                Assert.assertEquals("Rating F. Access is allowed.", MovieAccessService.accessMovie(i));
            }
            else{
                Assert.assertEquals("Access is denied", MovieAccessService.accessMovie(i));
            }
        }
    }


}