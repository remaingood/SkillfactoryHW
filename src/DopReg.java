import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DopReg {

    public static void main(String[] args) {
        String text = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        Pattern pattern = Pattern.compile("[a-zA-Z]*Error");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
