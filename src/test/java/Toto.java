import fr.xebia.fluent.regex.Pattern;
import fr.xebia.fluent.regex.PatternBuilder;

public class Toto {

    public static void main(String[] args) {

        Pattern pattern = PatternBuilder.build().withRange().from('a').to('z');
        System.out.println( pattern );

        Pattern pattern2 = PatternBuilder.build().
                withRange().
                    from('a').to('z').
            and().
                withoutRange().
                    from('1').to('5')
        .and();

        System.out.println( pattern2.toString() );
    }
}
