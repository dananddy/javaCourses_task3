package company;

import company.controller.Controller;
import company.model.Model;
import company.view.View;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {



        Controller controller = new Controller(new Model(), new View());

        controller.proccesUser(userLangIsUA(userLangMenu()));

    }

    private static int userLangMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your language:\n1:Ukrainian\n2:English\n");
        int menuKey = scan.nextInt();

        switch (menuKey){
            case 1:
                menuKey = 1;
                break;
            case 2:
                menuKey = 2;
                break;
            default:
                menuKey = 1;
                break;
        }
        return menuKey;
    }
    private static boolean userLangIsUA(int check){
        return (check == 1) ? true : false;
    }
}
