package block04.exception;

/**
 * Created by Vasyl_Voloshyn on 5/4/2017.
 */
public class LoginDuplicationException extends Exception {

    private String illegalNickName;
    public String getCurrentNickName(){
        return illegalNickName;
    }

    public LoginDuplicationException(String message, String currentNickName){
        super(message);
        illegalNickName = currentNickName;
    }
}
