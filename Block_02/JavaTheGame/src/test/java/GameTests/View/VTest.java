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
        String expected = "Test string";
        String actual;

        view.printMessage(expected);
        actual = output.toString();

        assertEquals(expected+"\r\n", actual);
    }

    @Test
    public void printMessageAndInt() {
        View view = new View();
        String expected = "Test string ";
        int expectedlInt = 5;
        String actual;

        view.printMessageAndInt(expected, expectedlInt);
        actual = output.toString();

        assertEquals(expected+expectedlInt +"\r\n", actual);
    }
}
