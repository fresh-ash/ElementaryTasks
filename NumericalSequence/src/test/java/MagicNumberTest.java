import model.MagicNumber;
import org.junit.Assert;
import org.junit.Test;

public class MagicNumberTest {

    @Test
    public void testGetMagicNumberOutput(){
        Double testValue = 56.2899;
        Integer expectedValue = 57;
        MagicNumber magicNumber = new MagicNumber(testValue);
        Assert.assertEquals(expectedValue, magicNumber.getOutput());
    }

    @Test
    public void testGetMagicNumberOutputWithNegativeData(){
        Double testValue = -56.2899;
        Integer expectedValue = 57;
        MagicNumber magicNumber = new MagicNumber(testValue);
        Assert.assertEquals(expectedValue, magicNumber.getOutput());
    }
}
