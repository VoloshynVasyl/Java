package TheGame.Main;

import TheGame.Controller.Controller;
import TheGame.Model.Model;
import TheGame.View.View;

import java.util.Scanner;

/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(model, view, sc);
        // Run
        controller.processUser();
    }
}
