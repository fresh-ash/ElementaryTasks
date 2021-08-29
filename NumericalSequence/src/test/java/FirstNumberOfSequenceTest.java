import model.FirstNumberOfSequence;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstNumberOfSequenceTest {

    FirstNumberOfSequence firstNumberOfSequence = new FirstNumberOfSequence(0.0);

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{56.2899, 8}, {-56.2899, 0}, {0.0, 0}};
    }

    @Test (dataProvider = "data-provider")
    public void testGetFirstNumberOfSequenceOutput(Double testValue, Integer expectedValue){
        firstNumberOfSequence.setInput(testValue);
        Assert.assertEquals(firstNumberOfSequence.getOutput(), expectedValue);
    }
}
