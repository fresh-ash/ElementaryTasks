import util.Validator;
import org.junit.Assert;
import org.junit.Test;

public class GetPositiveIntegerFromStringTest {

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionWithCharString(){
        String testData = "1d";
        Validator.getPositiveIntegerFromString(testData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionWithNegativeValue(){
        String testData = "-234";
        Validator.getPositiveIntegerFromString(testData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionWithTooBigValue(){
        String testData = "3350000000000000";
        Validator.getPositiveIntegerFromString(testData);
    }

    @Test
    public void testGettingZeroValue(){
        String testData = "0";
        int expectedValue = 0;
        int gotData = Validator.getPositiveIntegerFromString(testData);
        Assert.assertEquals(expectedValue, gotData);
    }

    @Test
    public void testGettingPositiveInteger(){
        String testData = "335";
        int expectedData = 335;
        int gotData = Validator.getPositiveIntegerFromString(testData);
        Assert.assertEquals(expectedData, gotData);
    }

}
