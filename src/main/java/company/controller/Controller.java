package company.controller;

import company.model.Model;
import company.view.View;

import java.util.Scanner;


public class Controller {

    private View view;
    private Model model;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void proccesUser(boolean languageIsUA){
        Scanner scan = new Scanner(System.in);
        DataBook inputDataInBook = new DataBook(view, scan);
        inputDataInBook.InputeData(languageIsUA);
    }
}
