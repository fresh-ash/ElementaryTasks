package JUnitTests;

import model.CustomerCountStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CustomerCountStrategyTest  extends BaseStrategyTest{

    CustomerCountStrategy strategy;

    public CustomerCountStrategyTest(Integer index, Integer value, boolean expectedResultForPredictFunction, List<Integer> dataList, boolean expectedResultForStrategy) {
        super(index, value, expectedResultForPredictFunction, dataList, expectedResultForStrategy);
    }

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{0, 2, true, Arrays.asList(3,2,4,3), true}, {0, 1, false, Arrays.asList(2,2,2,3), false}});
    }

    @Before
    public void init(){
        strategy = new CustomerCountStrategy();
    }

    @Test
    public void testPredictFunctionCustomerStrategy(){
        Assert.assertEquals(expectedResultForPredictFunction, strategy.getPredictFunction().apply(index, value));
    }

    @Test
    public void testCustomerStrategy(){
        Assert.assertEquals(expectedResultForStrategy, strategy.checkTicket(dataList));

    }
}
