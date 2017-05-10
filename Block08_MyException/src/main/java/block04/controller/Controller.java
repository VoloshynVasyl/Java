package block04.controller;

import java.util.Scanner;

import block04.model.Groups;
import block04.model.PhoneBook;
import block04.view.View;
import block04.exception.LoginDuplicationException;

/**
 * Created by Vasyl Voloshyn on 19.04.2017.
 */
public class Controller {

    private PhoneBook phoneBook;
    private View view;

    private final String NAMES_REGEX = "^[A-ZА-Я]{1,1}[a-zа-я]+$";
    private final String NICK_NAME_REGEX = "^[A-ZА-Яa-zа-я0-9]+$";
    private final String COMMENT_REGEX = "^[A-ZА-Яa-zа-я0-9\\,\\s\\.]+$";
    private final String PHONE_REGEX = "^[0-9]+$";
    private final String SECOND_PHONE_REGEX = "^[0-9]*$";
    private final String EMAIL_REGEX = "[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}";
    private final String INDEX_REGEX = "^[0-9]{5,7}$";
    private final String NUMBER_OF_REGEX = "^[0-9a-zа-я]{1,4}$";

    public Controller(PhoneBook phoneBook, View view) {
        this.phoneBook  = phoneBook;
        this.view = view;
    }

    private Scanner sc = new Scanner(System.in);
    private String currentString;

    public void processUser(){
        boolean condition = false;
        while(! condition){
            phoneBook.setSurname(inputValueWithScanner(sc, View.TYPE_SURNAME, NAMES_REGEX));
            phoneBook.setName(inputValueWithScanner(sc, View.TYPE_NAME, NAMES_REGEX));
            phoneBook.setPatronymic(inputValueWithScanner(sc, View.TYPE_PATRONYMIC, NAMES_REGEX));
            phoneBook.setSurnameAndInitials();

            boolean nickNameCond = false;
            while (!nickNameCond) {
                try {
                    phoneBook.setNickname(inputValueWithScanner(sc, View.TYPE_NICKNAME, NICK_NAME_REGEX));
                    nickNameCond = true;
                } catch (LoginDuplicationException e) {
                    view.printMessage(e.getCurrentNickName() + e.getMessage());
                }
            }

            phoneBook.setComment(inputValueWithScanner(sc, View.TYPE_COMMENT, COMMENT_REGEX));
            phoneBook.setGroup(validationForGroups(sc, View.TYPE_GROUP));
            phoneBook.setHomePhone(inputValueWithScanner(sc, View.TYPE_HOME_PHONE, PHONE_REGEX));
            phoneBook.setCellPhone(inputValueWithScanner(sc, View.TYPE_CELL_PHONE, PHONE_REGEX));
            phoneBook.setSecondCellPhone(inputValueWithScanner(sc, View.TYPE_SECOND_CELL_PHONE, SECOND_PHONE_REGEX));
            phoneBook.setEmail(inputValueWithScanner(sc, View.TYPE_EMAIL, EMAIL_REGEX));
            phoneBook.setSkype(inputValueWithScanner(sc, View.TYPE_SKYPE, NICK_NAME_REGEX));
            phoneBook.setAddress(0, inputValueWithScanner(sc, View.TYPE_INDEX, INDEX_REGEX));
            phoneBook.setAddress(1, inputValueWithScanner(sc, View.TYPE_CITY, NAMES_REGEX));
            phoneBook.setAddress(2, inputValueWithScanner(sc, View.TYPE_STREET, NAMES_REGEX));
            phoneBook.setAddress(3, inputValueWithScanner(sc, View.TYPE_HOUSE, NUMBER_OF_REGEX));
            phoneBook.setAddress(4, inputValueWithScanner(sc, View.TYPE_APARTMENT, NUMBER_OF_REGEX));
            phoneBook.setFullAddress();
            phoneBook.setLastEditDate();

            condition = true;
        }
    }

    private String inputValueWithScanner(Scanner sc, String message, String regEx) {
        view.printMessage(message);
        while( !(sc.hasNext() && (currentString = sc.next()).matches(regEx))) {
            view.printMessage(View.WRONG_INPUT_DATA + message);
        }
        return currentString;
    }

    private String validationForGroups(Scanner sc, String message){
        view.printMessage(message);
        boolean condition = false;
        while( ! condition) {
            currentString = sc.next();
            if(currentString.equals((Groups.BEST_FRIENDS).toString()) ||
                    currentString.equals((Groups.FRIENDS).toString()) ||
                    currentString.equals((Groups.FAMILY).toString())){
                condition = true;
            }
            else{
                view.printMessage(View.WRONG_INPUT_DATA + message);
                condition = false;
            }
        }
        return currentString;
    }
}
