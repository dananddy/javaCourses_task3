package company.controller;

import company.view.View;

import java.util.Scanner;

public class UtilityController {

    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputInfo(String message, String regex, boolean lang) {
        String res;
        view.printInput(message,lang, true);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printInput(message, lang, false);
        }
        return res;
    }
}
