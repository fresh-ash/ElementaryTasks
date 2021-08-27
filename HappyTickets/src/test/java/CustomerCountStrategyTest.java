import model.CustomerCountStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CustomerCountStrategyTest {
    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{0, 2, true}, {0, 1, false}});
    }

    Integer index;
    Integer value;
    boolean expectedResult;
    CustomerCountStrategy strategy;

    public CustomerCountStrategyTest(Integer index, Integer value, boolean expectedResult) {
        super();
        this.index = index;
        this.value = value;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init(){
        strategy = new CustomerCountStrategy();
    }

    @Test
    public void testFunctionCustomerStrategy(){
        Assert.assertEquals(expectedResult, strategy.getFunction().apply(index, value));
    }

    @Test
    public void testCustomerStrategy(){
        boolean expectedValue = true;
        List<Integer> testData1 = Arrays.asList(3,2,4,3);
        List<Integer> testData2 = Arrays.asList(2,2,2,3);
        Assert.assertEquals(expectedValue, strategy.checkTicket(testData1));
        Assert.assertNotEquals(expectedValue, strategy.checkTicket(testData2));
    }
}
