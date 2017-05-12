package GameTests.Controller;

import static org.mockito.Mockito.*;
import TheGame.Controller.Controller;
import TheGame.Model.Model;
import TheGame.View.View;
import GameTests.OutputTest;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;
/**
 * Created by Vasyl_Voloshyn on 4/19/2017.
 */
public class CTest extends OutputTest{
    @Test
    public void shouldProcessUserInput() {
        String input = "50\n25\n";
        Model model = mock(Model.class);
        View view = new View();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner sc = new Scanner(in);
        Controller controller;
        int min = 0;
        int max = 100;
        int randNum = 25;
        String subString = View.WINNER;

        when(model.rand(min, max)).thenReturn(randNum);
        when(model.getRnd()).thenReturn(randNum);
        controller = new Controller(model, view, sc);
        controller.processUser();

        String testOutput = output.toString();
        assertTrue(testOutput.contains(subString));
    }
}
