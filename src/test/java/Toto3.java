import fr.xebia.fluent.regex3.Context;
import fr.xebia.fluent.regex3.Regex;

import java.util.regex.Pattern;

import static fr.xebia.fluent.regex3.CharacterClasses.WORD;
import static fr.xebia.fluent.regex3.CharacterClasses.a_TO_z;
import static fr.xebia.fluent.regex3.RegexBuilder.regex;
import static fr.xebia.fluent.regex3.range.RangeDslBuilder.range;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/24/14
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Toto3 {



    public static void main(String[] args) {


            // ^([0-9a-zA-Z]([-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9})$
        regex().withStartOfLine().
                startGrp().
                    _(range().from('0').to('9').or().a_TO_z().or().from('A').to('Z')).
                    startGrp().
                        _(range().chars("-." + WORD)).zeroOrMoreTime().
                    endGrp().
                endGrp();


        Regex emailUserName = regex().
                _(WORD).
                _(a_TO_z.or().chars("-._")).zeroOrMoreTime().
                _(WORD);


        Regex groupTest =
            regex().
                startGrp().
                    startGrp().
                        _(regex().
                                _(WORD).
                                _(a_TO_z.or().chars("-._")).zeroOrMoreTime().
                                _(WORD)).
                    endGrp().
                    startGrp().
                        _(regex().
                                _(WORD).
                                _(a_TO_z.or().chars("-._")).zeroOrMoreTime().
                                _(WORD)).
                    endGrp().
                endGrp();

        System.out.println(groupTest.getContext().patternBuffer.toString());
        Pattern.compile(groupTest.getContext().patternBuffer.toString());

        Context context = emailUserName.getContext();

        System.out.println( context.patternBuffer.toString() );
        Pattern pattern = Pattern.compile(context.patternBuffer.toString());

        System.out.println(regex().withRegex(emailUserName).with("@").getContext().patternBuffer.toString());

    }
}
