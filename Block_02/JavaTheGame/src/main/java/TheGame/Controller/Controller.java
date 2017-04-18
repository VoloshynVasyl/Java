package TheGame.Controller;

import java.util.Scanner;
import TheGame.Model.Model;
import TheGame.View.View;
/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class Controller {
    // The Constants
    int min = 0;
    int max = 100;
    int currentValue;
    int numberOfTry = 1;

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

        while(true){
            view.printMessage(View.FROM + min + View.TO + max);
            currentValue = sizeCheck(inputIntValueWithScanner(sc));
            if(currentValue > model.RND){
                max = currentValue;
                view.printMessage(View.NUMBER_BIGGER_THAN_VALUE);
            }
            if(currentValue < model.RND){
                min = currentValue;
                view.printMessage(View.NUMBER_LESS_THAN_VALUE);
            }
            if(currentValue == model.RND){
                view.printMessage(View.SCORE + numberOfTry + View.ATTEMPTS);
                view.printMessage(View.WINNER);
                break;
            }
            numberOfTry++;
        }
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private int sizeCheck(int value){
        if(value >= min && value <= max){
            return value;
        }
        else{
            view.printMessage(View.OUT_OF_BOUNDS);
            return inputIntValueWithScanner(sc);
        }
    }
}
