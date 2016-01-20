import fr.xebia.fluent.regex2.Pattern;
import fr.xebia.fluent.regex2.PatternBuilder;

public class Toto2 {

    public static void main(String[] args) {

        Pattern pattern2 = PatternBuilder.build().
                withRange('a','z').
            and().
                withChars("789").
            and().
                withoutRange('1', '5');

        System.out.println( pattern2.toString() );
    }
}
