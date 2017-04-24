package GameTests.Model;

import TheGame.Model.Model;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class MTest {
    private final int MIN = 0;
    private final int MAX = 100;
    private Model model = new Model();
    private int numOffAttempts = 1000;
    private int[] array = new int[MAX+1];
    private int random;

    @Test
    public void random_shouldBeInBounds() {
        int test = model.rand(MIN, MAX);

        assertTrue("Rand num have to be bigger than min and less than max", test>=MIN && test<=MAX);
    }

    @Test
    public void random_shouldBeEvenlyDistributed(){
        for(int i = 0;i<numOffAttempts;i++){
            int random = model.rand(MIN, MAX);
            array[random] += 1;
        }

        assertTrue("Rand num have zeros in array", checkForZeros(array));
    }

    private boolean checkForZeros(int[] array){
        for(int i = 0;i<array.length;i++){
            if(array[i] == 0){
                return false;
            }
        }
        return true;
    }
}
