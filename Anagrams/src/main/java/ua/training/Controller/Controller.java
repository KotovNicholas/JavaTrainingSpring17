package ua.training.Controller;

import ua.training.Model.Model;
import ua.training.View.View;

/**
 * Created by Plavun on 29.03.2017.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){

        String textLine = view.getLine();


        String reverseLine =  model.getReverseLine(textLine);



        view.concatenationAndPrint("start line  = ", textLine);
        view.concatenationAndPrint("revers line = ", reverseLine);

    }

}
