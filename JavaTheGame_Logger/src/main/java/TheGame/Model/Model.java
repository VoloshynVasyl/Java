package TheGame.Model;

/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class Model {
    public static final int MIN = 0; // Минимальное число для диапазона
    public static final int MAX = 100; // Максимальное число для диапазона
    private final int RND = rand(MIN, MAX);
    public int getRnd(){
        return RND;
    }

    public int rand(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
