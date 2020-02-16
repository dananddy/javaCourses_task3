package company.controller;

import company.view.View;

import java.util.Scanner;



import static company.controller.RegexContainer.*;
import static company.view.TextConstant.*;

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

        this.firstName = utController.inputInfo(FIRST_NAME, inputRightLangFirstName(languageIsUA), languageIsUA);
        this.lastName = utController.inputInfo(LAST_NAME, inputRightLangLastName(languageIsUA),languageIsUA);
        this.middleName = utController.inputInfo(MIDDLE_NAME, inputRightLangMiddleName(languageIsUA),languageIsUA);

    }

    String inputRightLangFirstName(boolean lang){
        String regex = (lang) ? REGEX_FIRST_NAME_UKR : REGEX_FIRST_NAME_ENG;
        return regex;
    }
    String inputRightLangLastName(boolean lang){
        String regex = (lang) ? REGEX_LAST_NAME_UKR : REGEX_LAST_NAME_ENG;
        return regex;
    }
    String inputRightLangMiddleName(boolean lang){
        String regex = (lang) ? REGEX_LAST_NAME_UKR : REGEX_LAST_NAME_ENG;
        return regex;
    }
    String inputRightLangAdress(boolean lang){
        String regex = (lang) ? REGEX_ADRESS_UKR : REGEX_ADRESS_ENG;
        return regex;
    }

}
