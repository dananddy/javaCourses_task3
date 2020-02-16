package company.controller;

public interface RegexContainer {

    enum REGEX_FIRST_NAME{
        ;   //?
        private String REGEX_FIRST_NAME (boolean isUA){
            String regex = (isUA) ? "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$": "^[A-Z][a-z]{1,20}$";
            return regex;
        }
    }
    enum REGEX_LAST_NAME{
        ;   //?
        private String REGEX_LAST_NAME (boolean isUA){
            String regex = (isUA) ? "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$": "^[A-Z][a-z]{1,20}$";
            return regex;
        }
    }

    enum REGEX_ADRESS{
        ;   //?
        private String REGEX_ADRESS (boolean isUA){
            String regex = (isUA) ? "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$": "^[A-Z][a-z]{1,20}$";
            return regex;
        }
    }

    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_PHONE_NUMBER = "^((\\+)?\\b(8|38)?(0[\\d]{2}))([\\d-]{5,8})([\\d]{2})$";

    String REGEX_EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

    String REGEX_COMMENT = "^([A-za-z]?([0-9]+)?[ ]?[0-9]?[A-za-z][0-9]?[ ]?){1,100}$";

    String REGEX_SKYPE = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_DATE = "^([0-3][0-9])[.]([0|1][0-9])[.]([1-2][0,9][0-9]{2})$";
}
