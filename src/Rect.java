import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rect {
    public static void main(String[] args) {
        String text = "В строке *-ки *должны* примыкать к *СЛОВУ*) должны быть найдены слова *должны* и *СЛОВУ*.";
        Pattern pattern = Pattern.compile("\\*[А-Яа-я]+\\*|*\\[а-яА-я]+\\*");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.print("\n" + text.substring(start, end) + "\n");
        }
    }
}
