package fr.xebia.fluent.regex2;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Pattern {

    RangePattern withRange(Character from, Character to);
    RangePattern withoutRange(Character from, Character to);
    RangePattern withChars(CharSequence chars);
    Pattern startWith(Pattern pattern);


}
