package Block01_Task02;

/**
 * Created by Vasyl_Voloshyn on 4/13/2017.
 */
public class View {
    // Text's constants
    public static final String SIZE_OF_ARRAY = "Type size of array you want to use:";
    public static final String INPUT_ARRAY = "Type array element №";
    public static final String WRONG_INPUT_DATA = "Wrong input! Integer only! ";
    public static final String WRONG_INPUT_DATA_FOR_SIZE = "Wrong input! Size have to be bigger than 0!";
    public static final String TYPE_INT_DATA = "Type INT data:";
    public static final String NEW_ARRAY = "Swapped array is:";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printArray(int[] array){
        for(int i =0; i<array.length-1;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1]);
    }
}
