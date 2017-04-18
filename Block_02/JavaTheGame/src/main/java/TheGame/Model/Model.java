package TheGame.Model;

/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class Model {
    final int MIN = 0; // Минимальное число для диапазона
    final int MAX = 100; // Максимальное число для диапазона
    public final int RND = rand(MIN, MAX);

    public int rand(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
