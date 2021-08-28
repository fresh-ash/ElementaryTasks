package JUnitTests;

import model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class HappyTicketHolderTest {

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{Arrays.asList(4, 2, 2, 2, 2, 4), new EasyCountStrategy(), 1}, {Arrays.asList(3, 2, 2, 2, 2, 4), new EasyCountStrategy(), 0},
                                    {Arrays.asList(2, 1, 1, 2, 2, 2), new DifficultCountStrategy(), 1}, {Arrays.asList(1, 1, 1, 2, 2, 2), new DifficultCountStrategy(), 0},
                                     {Arrays.asList(3, 3, 0, 2, 2, 2), new CustomerCountStrategy(), 1}, {Arrays.asList(3, 3, 1, 2, 2, 2), new CustomerCountStrategy(), 0}});
    }

    List<Integer> number;
    ICountStrategy strategy;
    Integer expectedValue;
    HappyTicketsHolder holder;

    @Before
    public void init(){
        holder = new HappyTicketsHolder(new CustomerCountStrategy());
    }

    public HappyTicketHolderTest(List<Integer> number, ICountStrategy strategy, Integer expectedValue) {
        this.number = number;
        this.strategy = strategy;
        this.expectedValue = expectedValue;
    }

    @Test
    public void testIncreaseTicketHolderCounter(){
        holder.setStrategy(strategy);
        holder.countTickets(number);
        Assert.assertEquals(expectedValue, holder.getCountHappyTickets());
    }

}
