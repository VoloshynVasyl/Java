package TheGame.Main;

import TheGame.Controller.Controller;
import TheGame.Model.Model;
import TheGame.View.View;
/**
 * Created by Vasyl_Voloshyn on 4/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
