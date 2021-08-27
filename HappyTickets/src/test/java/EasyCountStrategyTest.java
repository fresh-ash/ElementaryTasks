import model.EasyCountStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
@RunWith(Parameterized.class)
public class EasyCountStrategyTest {
    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{3, 1, true}, {0, 1, false}});
    }

    Integer index;
    Integer value;
    boolean expectedResult;
    EasyCountStrategy strategy;

    public EasyCountStrategyTest(Integer index, Integer value, boolean expectedResult) {
        super();
        this.index = index;
        this.value = value;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init(){
        strategy = new EasyCountStrategy();
    }

    @Test
    public void testFunctionEasyStrategy(){
        Assert.assertEquals(expectedResult, strategy.getFunction().apply(index, value));
    }

    @Test
    public void testEasyStrategy(){
        boolean expectedValue = true;
        List<Integer> testData1 = Arrays.asList(3,2,2,7);
        List<Integer> testData2 = Arrays.asList(2,2,2,3);
        Assert.assertEquals(expectedValue, strategy.checkTicket(testData1));
        Assert.assertNotEquals(expectedValue, strategy.checkTicket(testData2));
    }
}
