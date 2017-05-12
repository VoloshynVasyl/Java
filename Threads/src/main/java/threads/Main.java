package threads;

/**
 * Created by Vasyl_Voloshyn on 5/12/2017.
 */
public class Main {
    public static void main(String args[]) throws InterruptedException{
        Program pr = new Program();
        int sum = pr.process();
        System.out.println(sum);
    }
}
