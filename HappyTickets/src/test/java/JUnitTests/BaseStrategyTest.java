package JUnitTests;

import java.util.List;

public class BaseStrategyTest {
    Integer index;
    Integer value;
    boolean expectedResultForPredictFunction;
    boolean expectedResultForStrategy;
    List<Integer> dataList;

    public BaseStrategyTest(Integer index, Integer value, boolean expectedResultForPredictFunction, List<Integer> dataList, boolean expectedResultForStrategy) {
        this.index = index;
        this.value = value;
        this.expectedResultForPredictFunction = expectedResultForPredictFunction;
        this.dataList = dataList;
        this.expectedResultForStrategy = expectedResultForStrategy;
    }
}
