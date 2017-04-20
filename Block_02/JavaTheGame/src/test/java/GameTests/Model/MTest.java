package GameTests.Model;

import TheGame.Model.Model;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class MTest {

    @Test
    public void random() {
        Model model = new Model();
        int min = 0;
        int max = 100;

        int test = model.rand(min, max);

        assertTrue("Rand num have to be bigger than min and less than max", test>=min && test<=max);
    }
}
