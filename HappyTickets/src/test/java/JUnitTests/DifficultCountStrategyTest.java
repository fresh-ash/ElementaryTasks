package JUnitTests;

import model.DifficultCountStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class DifficultCountStrategyTest extends BaseStrategyTest{


    public DifficultCountStrategyTest(Integer index, Integer value, boolean expectedResultForPredictFunction,
                                      List<Integer> dataList, boolean expectedResultForStrategy) {
        super(index, value, expectedResultForPredictFunction, dataList, expectedResultForStrategy);
    }

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{0, 1, true, Arrays.asList(3,2,2,3), true},
                                            {1, 1, false, Arrays.asList(2,2,2,3), false}});
    }

    DifficultCountStrategy strategy;

    @Before
    public void init(){
        strategy = new DifficultCountStrategy();
    }

    @Test
    public void testPredictFunctionDifficultStrategy(){
        Assert.assertEquals(expectedResultForPredictFunction, strategy.getPredictFunction().apply(index, value));
    }

    @Test()
    public void testDifficultStrategy(){
        Assert.assertEquals(expectedResultForStrategy, strategy.checkTicket(dataList));
    }
}
