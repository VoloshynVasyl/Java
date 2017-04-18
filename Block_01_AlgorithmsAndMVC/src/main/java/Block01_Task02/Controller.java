package Block01_Task02;

import java.util.Scanner;
/**
 * Created by Vasyl_Voloshyn on 4/13/2017.
 */
public class Controller {
    // The Constants
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";


    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    Scanner sc = new Scanner(System.in);

    public void processUser(){

        model.setSize(checkSize(typeSize(sc)));

        int[] tmp = model.getArray();
        for(int i = 0; i<model.getSize();i++){
            tmp[i] = typeArray(sc, i);
        }
        model.setArray(tmp);

        int[] newArray = model.swappedPositiveNumbers(model.getArray());
        view.printMessage(View.NEW_ARRAY);
        view.printArray(newArray);
    }

    // The Utility methods
    public int typeSize(Scanner sc){
        view.printMessage(View.SIZE_OF_ARRAY);
        while (!sc.hasNextInt()){
            view.printMessage(View.WRONG_INPUT_DATA + View.TYPE_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public int typeArray(Scanner sc, int i){
        view.printMessage(View.INPUT_ARRAY + i);
        while (!sc.hasNextInt()){
            view.printMessage(View.WRONG_INPUT_DATA + View.TYPE_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
    public int checkSize(int size){
        if(size > 0){
            return size;
        }
        else{
            view.printMessage(View.WRONG_INPUT_DATA_FOR_SIZE);
            return typeSize(sc);
        }
    }
}
