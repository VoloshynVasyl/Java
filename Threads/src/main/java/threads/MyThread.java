package threads;

/**
 * Created by Vasyl Voloshyn on 12.05.2017.
 */
public class MyThread extends Thread{
    public MyThread(int[] array, int numOfThread){
        this.array = array;
        this.numOfThread = numOfThread;
        System.out.println("New thread num "+numOfThread+" is added");
    }
    private int[] array;
    public int numOfThread;
    public int sumOfEl = 0;
    public void run(){
        sumOfEl = summOfElements(array);
        System.out.println("In thread num "+numOfThread+" run()");
    }

    public int summOfElements(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }


}