import interfaces.IValidator;
import org.junit.Assert;
import org.junit.Test;

public class GetPositiveIntegerFromStringTest {

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionWithCharString(){
        String testData = "1d";
        IValidator.getPositiveIntegerFromString(testData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionWithNegativeValue(){
        String testData = "-234";
        IValidator.getPositiveIntegerFromString(testData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionWithTooBigValue(){
        String testData = "3350000000000000";
        IValidator.getPositiveIntegerFromString(testData);
    }

    @Test
    public void testGettingZeroValue(){
        String testData = "0";
        int expectedValue = 0;
        int gotData = IValidator.getPositiveIntegerFromString(testData);
        Assert.assertEquals(expectedValue, gotData);
    }

    @Test
    public void testGettingPositiveInteger(){
        String testData = "335";
        int expectedData = 335;
        int gotData = IValidator.getPositiveIntegerFromString(testData);
        Assert.assertEquals(expectedData, gotData);
    }

}
