package Vasyl_Voloshyn.Task_01;

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
    public void processUser(){
        Scanner sc = new Scanner(System.in);


        model.setHello(inputWordHelloWithScanner(sc));
        model.setWorld(inputWordWorldWithScanner(sc));

        view.printMessage(model.addWords(model.getHello(), model.getWorld()));
    }

    // The Utility methods
    public String inputWordHelloWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_HELLO);
        String value = sc.next();

        while(!value.equals(HELLO)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_HELLO);
            value = sc.next();
        }
        return value;
    }

    public String inputWordWorldWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_WORLD);
        String value = sc.next();

        while(!value.equals(WORLD)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_WORLD);
            value = sc.next();
        }
        return value;
    }
}
