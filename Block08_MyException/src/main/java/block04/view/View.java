package block04.view;

/**
 * Created by Vasyl Voloshyn on 19.04.2017.
 */
public class View {
    public static final String TYPE_SURNAME = "Input your surname:";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please!";
    public static final String TYPE_NAME = "Input your name:";
    public static final String TYPE_PATRONYMIC = "Input your patronymic:";
    public static final String TYPE_NICKNAME = "Input your nickname:";
    public static final String TYPE_COMMENT = "Input your comment:";
    public static final String TYPE_GROUP = "Chose your group(FRIENDS, BEST_FRIENDS, FAMILY):";
    public static final String TYPE_HOME_PHONE = "Input your home phone:";
    public static final String TYPE_CELL_PHONE = "Input your cell phone:";
    public static final String TYPE_SECOND_CELL_PHONE = "Input your second cell phone:";
    public static final String TYPE_EMAIL = "Input your e-mail:";
    public static final String TYPE_SKYPE = "Input your skype:";
    public static final String TYPE_INDEX = "Input your index:";
    public static final String TYPE_CITY = "Input your city:";
    public static final String TYPE_STREET = "Input your street:";
    public static final String TYPE_HOUSE = "Input your house number:";
    public static final String TYPE_APARTMENT = "Input your house apartment number:";
    public static final String LOGIN_DUPLICATION_EXCEPTION = " - is the login that already exists in phone book.";

    public void printMessage(String message){
        System.out.println(message);
    }
}
