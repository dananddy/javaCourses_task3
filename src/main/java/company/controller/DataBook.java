package company.controller;

import company.view.View;

import java.util.Scanner;

import static company.controller.RegexContainer.*;
import static company.view.TextConstant.FIRST_NAME;

public class DataBook {

    private View view;
    private Scanner scanner;

    private String firstName;
    private String lastName;
    private String middleName;

    private String login;

    private String userComment;

    private UserGroup group;

    private String phoneNumberHome;
    private String phoneNumberMobile1;
    private String phoneNumberMobile2;

    private String userEmail;
    private String userSkype;

    private String Adress;

    private String date;

    public DataBook(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }

    public void InputeData(boolean languageIsUA){
        UtilityController utController = new UtilityController(scanner, view);

        //String userInfoText = ((String.valueOf(View.getLang(languageIsUA)).equals("ua")) ? REGEX_FIRST_NAME_UKR : REGEX_FIRST_NAME_ENG );

        this.firstName = utController.inputInfo(FIRST_NAME, REGEX_FIRST_NAME_ENG, languageIsUA);


    }


}
