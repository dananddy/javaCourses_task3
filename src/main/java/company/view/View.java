package company.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static company.view.TextConstant.INPUT_STRING_DATA;
import static company.view.TextConstant.WRONG_INPUT_DATA;

public class View {

    private static String MESSAGE_BUNDLE = "Messages";
    private static Locale country = new Locale("ua","UA");

    public static ResourceBundle getLang(boolean countryIsUA){
        final ResourceBundle langBundle =
                ResourceBundle.getBundle(MESSAGE_BUNDLE, setLang(countryIsUA));

        return langBundle;
    }
    private static Locale setLang(boolean countryIsUA){
        if(countryIsUA) return country;
        else return country = new Locale("en");
    }

    public void printMessage(String message){ System.out.println(message); }

    public String addInfoByConcatanation(String ... words){
        StringBuilder text = new StringBuilder();
        for (String word: words) text = text.append(word);

        return new String(text);
    }

     public void printInput(String message, boolean lang, boolean isWrongInput){
        String wrongInput = (isWrongInput) ? WRONG_INPUT_DATA : null;

        printMessage(addInfoByConcatanation(getLang(lang).getString(wrongInput),
                                            getLang(lang).getString(INPUT_STRING_DATA),
                                            getLang(lang).getString(message)));
     }
}
