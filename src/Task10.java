import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
      String text = "Рекс Лорд Лом Шарик Бобик Шалун";
        Pattern pattern = Pattern.compile("\\bЛ[а-я]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
