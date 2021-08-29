import input.CLI;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

@RunWith(Parameterized.class)
public class CheckAnswerFuncCLITest {

    boolean expectedValue;
    String testData;


    @Parameterized.Parameters
    public static Iterable input(){
        return Arrays.asList(new Object[][] {{true, "Y"}, {true, "y"}, {true, "Yes"}, {true, "yes"}, {false, " "},
                                            {false, "F"}, {false, "67"}, {false, "n"}, {false, "@"}});
    }

    public CheckAnswerFuncCLITest(boolean expectedValue, String testData) {
        this.expectedValue = expectedValue;
        this.testData = testData;
    }

    @Test
    public void testCheckAnswerFunction(){
        CLI cli = new CLI(new Scanner(new ByteArrayInputStream(testData.getBytes(StandardCharsets.UTF_8))));
        Assert.assertEquals(expectedValue, cli.checkAnswer(testData));
    }
}
