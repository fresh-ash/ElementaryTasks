package JUnitTests;

import model.DifficultCountStrategy;
import model.EasyCountStrategy;
import model.HappyTicketsHolder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import service.TicketsHelper;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class TicketHelperGetWinnerFunctionTest {

    HappyTicketsHolder easyWay;
    HappyTicketsHolder difficultWay;
    TicketsHelper helper;
    int firstTestArgument;
    int secondTestArgument;
    int expectedValue;

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{33, 44, -1}, {33, 33, 0}, {33, 22, 1}});
    }

    @Before
    public void init(){
        easyWay = new HappyTicketsHolder(new EasyCountStrategy());
        difficultWay = new HappyTicketsHolder(new DifficultCountStrategy());
        helper = new TicketsHelper(easyWay, difficultWay);
    }

    public TicketHelperGetWinnerFunctionTest(int firstTestArgument, int secondTestArgument, int expectedValue) {
        this.expectedValue = expectedValue;
        this.firstTestArgument = firstTestArgument;
        this.secondTestArgument = secondTestArgument;
    }

    @Test
    public void testTicketHelperWinnerFunction(){
        easyWay.setCountHappyTickets(firstTestArgument);
        difficultWay.setCountHappyTickets(secondTestArgument);
        Assert.assertEquals(expectedValue, helper.getWinner());
    }



}
