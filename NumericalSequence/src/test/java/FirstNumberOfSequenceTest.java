import model.FirstNumberOfSequence;
import org.junit.Assert;
import org.junit.Test;

public class FirstNumberOfSequenceTest {

    @Test
    public void testGetMagicNumberOutput(){
        Double testValue = 56.2899;
        Integer expectedValue = 57;
        FirstNumberOfSequence firstNumberOfSequence = new FirstNumberOfSequence(testValue);
        Assert.assertEquals(expectedValue, firstNumberOfSequence.getOutput());
    }

    @Test
    public void testGetMagicNumberOutputWithNegativeData(){
        Double testValue = -56.2899;
        Integer expectedValue = 57;
        FirstNumberOfSequence firstNumberOfSequence = new FirstNumberOfSequence(testValue);
        Assert.assertEquals(expectedValue, firstNumberOfSequence.getOutput());
    }
}
