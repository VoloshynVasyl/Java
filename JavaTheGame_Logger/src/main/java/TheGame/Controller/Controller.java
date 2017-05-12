package TheGame.Controller;

import java.util.Scanner;
import TheGame.Model.Model;
import TheGame.View.View;
import org.apache.log4j.Logger;
/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class Controller {
    // The Constants
    private int min = Model.MIN;
    private int max = Model.MAX;
    private int currentValue;
    private int numberOfTry = 1;
    private static final Logger log = Logger.getLogger(Controller.class);

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view, Scanner sc) {
        this.model  = model;
        this.view = view;
        this.sc = sc;
    }

    // The Work method
    Scanner sc;

    public void processUser(){
        int rnd = model.getRnd();

        while(true){
            view.printMessage(View.FROM + min + View.TO + max);
            log.info(View.FROM + min + View.TO + max);
            currentValue = sizeCheck(inputIntValueWithScanner(sc));
            if(currentValue > rnd){
                max = currentValue;
                view.printMessage(View.NUMBER_BIGGER_THAN_VALUE);
                log.info(View.NUMBER_BIGGER_THAN_VALUE);
            }
            if(currentValue < rnd){
                min = currentValue;
                view.printMessage(View.NUMBER_LESS_THAN_VALUE);
                log.info(View.NUMBER_LESS_THAN_VALUE);
            }
            if(currentValue == rnd){
                view.printMessage(View.SCORE + numberOfTry + View.ATTEMPTS);
                view.printMessage(View.WINNER);
                log.info(View.SCORE + numberOfTry + View.ATTEMPTS + "\n" + View.WINNER);
                break;
            }
            numberOfTry++;
        }
    }

    // The Utility methods
    private int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        log.info(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            log.error(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        int value = sc.nextInt();
        log.info(value);
        return value;
    }

    private int sizeCheck(int value){
        if(value >= min && value <= max){
            return value;
        }
        else{
            view.printMessage(View.OUT_OF_BOUNDS);
            log.error(View.OUT_OF_BOUNDS);
            return inputIntValueWithScanner(sc);
        }
    }
}
