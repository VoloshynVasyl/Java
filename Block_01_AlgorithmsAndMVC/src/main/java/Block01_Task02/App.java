package Block01_Task02;

/**
 * Created by Vasyl_Voloshyn on 4/13/2017.
 */
public class App 
{
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
