package JUnitTests;

import model.EasyCountStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EasyCountStrategyTest extends BaseStrategyTest{

    public EasyCountStrategyTest(Integer index, Integer value, boolean expectedResultForPredictFunction, List<Integer> dataList, boolean expectedResultForStrategy) {
        super(index, value, expectedResultForPredictFunction, dataList, expectedResultForStrategy);
    }

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{3, 1, true, Arrays.asList(3,2,2,7), true}, {0, 1, false, Arrays.asList(2,2,2,3), false}});
    }

    EasyCountStrategy strategy;

    @Before
    public void init(){
        strategy = new EasyCountStrategy();
    }

    @Test
    public void testPredictFunctionEasyStrategy(){
        Assert.assertEquals(expectedResultForPredictFunction, strategy.getPredictFunction().apply(index, value));
    }

    @Test
    public void testEasyStrategy(){
        Assert.assertEquals(expectedResultForStrategy, strategy.checkTicket(dataList));
    }
}
