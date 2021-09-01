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
    int expectedValueEasyWay;
    int getExpectedValueDifficultWay;

    public TicketHelperCountFunctionTest(int firstNumberOfSequence, int lastNumberOfSequence, int expectedValueEasyWay,
                                         int getExpectedValueDifficultWay) {
        this.firstNumberOfSequence = firstNumberOfSequence;
        this.lastNumberOfSequence = lastNumberOfSequence;
        this.expectedValueEasyWay = expectedValueEasyWay;
        this.getExpectedValueDifficultWay = getExpectedValueDifficultWay;
    }

    @Before
    public void init(){
        easyWay = new HappyTicketsHolder(new EasyCountStrategy());
        difficultWay = new HappyTicketsHolder(new DifficultCountStrategy());
        helper = new TicketsHelper(easyWay, difficultWay);
    }

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{0, 0, 1, 1}, {-1, 567, 0, 0}, {0, 999999, 55252, 55252}, {0, 100, 1, 10}});
    }

    @Test
    public void testTicketHelperCountFunction(){
        try {
            helper.countHappyTickets(firstNumberOfSequence, lastNumberOfSequence);
            int gotEasyWayData = easyWay.getCountHappyTickets();
            int gotDifficultWayData = difficultWay.getCountHappyTickets();
            Assert.assertEquals(expectedValueEasyWay, gotEasyWayData);
            Assert.assertEquals(getExpectedValueDifficultWay, gotDifficultWayData);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
