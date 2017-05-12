package GameTests.View;

import GameTests.OutputTest;
import TheGame.View.View;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Vasyl_Voloshyn on 4/19/2017.
 */
public class VTest extends OutputTest {
    @Test
    public void testPrintMessage() {
        View view = new View();
        String test = "Test string";

        view.printMessage(test);

        assertEquals(test+"\r\n", output.toString());
    }

    @Test
    public void printMessageAndInt() {
        View view = new View();
        String test = "Test string ";
        int testInt = 5;

        view.printMessageAndInt(test, testInt);

        assertEquals(test+testInt +"\r\n", output.toString());
    }
}
