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

    @Test
    public void randomAllInputs() {
        Model model = new Model();
        int min = 0;
        int max = 100;
        int repetition = 1000;
        boolean condition = true;
        int minNum = 1;
        int[] arrayOfRandom = new int[max+1];

        for(int i = 0; i < repetition; i++){
            int tmp = model.rand(min, max);
            arrayOfRandom[tmp] += 1;
        }

        for(int i = 0; i < arrayOfRandom.length; i++){
            if(arrayOfRandom[i] < minNum) {
                condition = false;
            }
        }
        assertTrue("Rand num have to be bigger than min and less than max", condition);
    }
}
