package fr.xebia.fluent.regex3;


import fr.xebia.fluent.regex3.range.RangeUnionDsl;

import static fr.xebia.fluent.regex3.range.RangeDslBuilder.range;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/24/14
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterClasses {

    public static final String DIGIT = "\\\\d";
    public static final String WORD = "\\\\w";

    public static final RangeUnionDsl a_TO_z = range().from('a').to('z');

}
