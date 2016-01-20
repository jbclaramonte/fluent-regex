package fr.xebia.fluent.regex3;

import fr.xebia.fluent.regex3.range.RangeDsl;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Regex {

//    RangePattern withRange(Character from, Character to);
//    RangePattern withoutRange(Character from, Character to);
//    RangePattern withChars(CharSequence chars);

    Regex withStartOfLine();

    Regex with(RangeDsl rangeDsl);
    Regex _(RangeDsl rangeDsl);

    Regex with(String patternStr);
    Regex _(String patternStr);

    Regex withRegex(Regex regex);
    Regex _(Regex regex);

    Regex zeroOrMoreTime();

    Regex startGrp();
    Regex endGrp();

    Regex getRegEx();
    Context getContext();
}
