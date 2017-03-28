package ua.training;

import ua.training.Controller.Controller;
import ua.training.Model.Model;
import ua.training.View.View;

/**
 * Created by Plavun on 29.03.2017.
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
