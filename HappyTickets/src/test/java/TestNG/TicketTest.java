package TestNG;

import model.Ticket;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class TicketTest {

    @DataProvider(name = "data-provider")
    public Object[][] input(){
        return new Object[][] {{0, Arrays.asList()}, {4567890, Arrays.asList(0,9,8,7,6,5,4)}, {333333, Arrays.asList(3,3,3,3,3,3)}};
    }
    Ticket ticket;

    @BeforeTest
    public void init(){
        ticket = new Ticket(0);
    }

    @Test(dataProvider = "data-provider")
    public void getTicketNumberAsArray(Integer testValue, List<Integer> expectedList){
        ticket.setNumber(testValue);
        Assert.assertEquals(expectedList, ticket.getNumberAsArray());
    }
}
