import model.Ticket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TicketTest {

    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{0, Arrays.asList()}, {4567890, Arrays.asList(0,9,8,7,6,5,4)}, {333333, Arrays.asList(3,3,3,3,3,3)}});
    }

    List<Integer> expectedList;
    Integer testValue;
    Ticket ticket;

    public TicketTest(Integer testValue, List<Integer> expectedList) {
        this.expectedList = expectedList;
        this.testValue = testValue;
    }

    @Before
   public void init(){
        ticket = new Ticket(0);
    }

    @Test
    public void getTicketNumberAsArray(){
        ticket.setNumber(testValue);
        Assert.assertEquals(expectedList, ticket.getNumberAsArray());
    }
}
