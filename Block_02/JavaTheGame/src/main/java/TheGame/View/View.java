package TheGame.View;

/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class View {
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUT_OF_BOUNDS = "Wrong input! Out of bounds!";
    public static final String NUMBER_BIGGER_THAN_VALUE = "Current value bigger than my value, try again";
    public static final String NUMBER_LESS_THAN_VALUE = "Current value less than my value, try again";
    public static final String FROM = "Range of values from ";
    public static final String TO = " to ";
    public static final String SCORE = "Your score is: ";
    public static final String ATTEMPTS = " attempts!";
    public static final String WINNER = "Congratulations!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }
}
