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
public class TicketHelperCountFunctionTest {

    HappyTicketsHolder easyWay;
    HappyTicketsHolder difficultWay;
    TicketsHelper helper;
    int firstNumberOfSequence;
    int lastNumberOfSequence;
    int expectedValue;

    public TicketHelperCountFunctionTest(int firstNumberOfSequence, int lastNumberOfSequence, int expectedValue) {
        this.firstNumberOfSequence = firstNumberOfSequence;
        this.lastNumberOfSequence = lastNumberOfSequence;
        this.expectedValue = expectedValue;
    }

    @Before
    public void init(){
        easyWay = new HappyTicketsHolder(new EasyCountStrategy());
        difficultWay = new HappyTicketsHolder(new DifficultCountStrategy());
        helper = new TicketsHelper(easyWay, difficultWay);
    }

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{0, 0, 1}, {-1, 567, 0}, {0, 999999, 55252}});
    }

    @Test
    public void testTicketHelperCountFunction() throws IllegalArgumentException{
        try {
            helper.countHappyTickets(firstNumberOfSequence, lastNumberOfSequence);
            int gotEasyWayData = easyWay.getCountHappyTickets();
            int gotDifficultWayData = difficultWay.getCountHappyTickets();
            Assert.assertEquals(expectedValue, gotEasyWayData);
            Assert.assertEquals(expectedValue, gotDifficultWayData);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
