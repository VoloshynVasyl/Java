package block04;

import block04.model.PhoneBook;
import block04.view.View;
import block04.controller.Controller;
/**
 * Created by Vasyl Voloshyn on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        View view = new View();
        Controller controller = new Controller(phonebook, view);

        controller.processUser();
    }
}
