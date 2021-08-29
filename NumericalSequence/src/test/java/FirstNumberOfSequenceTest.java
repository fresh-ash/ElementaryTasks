import model.FirstNumberOfSequence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNumberOfSequenceTest {

    FirstNumberOfSequence firstNumberOfSequence = new FirstNumberOfSequence(0.0);

    @Test
    public void testGetFirstNumberOfSequenceOutput(){
        Double testValue = 56.2899;
        Integer expectedValue = 8;
        firstNumberOfSequence.setInput(testValue);
        Assert.assertEquals(expectedValue, firstNumberOfSequence.getOutput());
    }

    @Test
    public void testGetFirstNumberOfSequenceWithNegativeData(){
        Double testValue = -56.2899;
        Integer expectedValue = 0;
        firstNumberOfSequence.setInput(testValue);
        Assert.assertEquals(expectedValue, firstNumberOfSequence.getOutput());
    }
}
