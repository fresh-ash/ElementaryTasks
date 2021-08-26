import model.Ticket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketTest {

    List<Integer> expectedList;
    Integer testValue;
    Ticket ticket;

    @Before
   public void init(){
        testValue = 30450;
         ticket = new Ticket(testValue);
        expectedList = new ArrayList<>(Arrays.asList(0,5,4,0,3));
    }

    @Test
    public void getTicketNumberAsArray(){
        Assert.assertEquals(expectedList, ticket.getNumberAsArray());
    }
}
