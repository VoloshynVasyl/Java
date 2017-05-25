package threads;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Vasyl Voloshyn on 12.05.2017.
 */
public class Program {
    int NUM_OF_THREADS = 4;
    int NUM_OF_ELEM = 100000;
    int[] array = new int[NUM_OF_ELEM];
    int lengthOfSubArray = array.length/NUM_OF_THREADS;
    List<MyThread> threads = new ArrayList<>();

    public int process() throws InterruptedException {
        addElToArray(array);
        int[][] tmp = partOfArray(array, NUM_OF_THREADS);
        int SUM = 0;
        for(int i = 0; i< NUM_OF_THREADS; i++){
            int[] tmpArray = currentArray(tmp, i, lengthOfSubArray);
            threads.add(new MyThread(tmpArray, i));
        }
        for (MyThread thread: threads) {
            thread.run();
        }
        for (MyThread thread: threads) {
            thread.join();
            System.out.println("Thread's work is finished. Thread num " + thread.numOfThread);
        }
        for (MyThread thread: threads) {
            SUM += thread.sumOfEl;
            System.out.println("Sum of current thread is: " + SUM);
        }
        System.out.println("Final SUM is: "+SUM);
        return SUM;
    }

    public int[][] partOfArray(int[] sourceArray, int splitTo){
        int[][] arrayOfSubArrays = new int[splitTo][sourceArray.length/splitTo];
        for(int i = 0; i < splitTo; i++){
            for(int j = 0; j < sourceArray.length/splitTo; j++){
                arrayOfSubArrays[i][j] = sourceArray[j+i*(sourceArray.length/splitTo)];
            }
        }
        return arrayOfSubArrays;
    }

    public int[] currentArray(int[][] sourceArray, int index, int lengthOf){
        int[] tmp = new int[lengthOf];
        for(int i = 0; i < lengthOf; i++){
            tmp[i] = sourceArray[index][i];
        }
        return tmp;
    }

    public void addElToArray(int[] array){
        for(int i = 0; i<array.length; i++){
            array[i] =1;
        }
    }
}
