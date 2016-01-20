package fr.xebia.fluent.regex3;

import fr.xebia.fluent.regex3.range.RangeDsl;
import fr.xebia.fluent.regex3.regexitem.*;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegexBuilder implements Regex {

    public RegexItemList regexItemList = new RegexItemList();

    public static Regex regex() {
        return new RegexBuilder();
    }

    private RegexBuilder() {
    }

//    @Override
//    public RangePattern withRange(Character from, Character to) {
//        regexItemList.add(new RegexRangeWithIntervalItem(from, to));
//        return new RangePatternImpl(this);
//    }
//
//    @Override
//    public RangePattern withoutRange(Character from, Character to) {
//        regexItemList.add(new RegexRangeWithoutIntervalItem(from, to));
//        return new RangePatternImpl(this);
//    }
//
//    @Override
//    public RangePattern withChars(CharSequence chars) {
//        regexItemList.add(new RegexRangeWithSequenceItem(chars));
//        return new RangePatternImpl(this);
//    }

    @Override
    public Regex with(RangeDsl rangeDsl) {
        regexItemList.add(new RegexStringItem(rangeDsl.toString()));
        return this;
    }

    @Override
    public Regex _(RangeDsl rangeDsl) {
        regexItemList.add(new RegexStringItem(rangeDsl.toString()));
        return this;
    }

    @Override
    public Regex withStartOfLine() {
        regexItemList.add(new RegexStringItem("^"));
        return this;
    }

    @Override
    public Regex with(String patternStr) {
        regexItemList.add(new RegexStringItem(patternStr));
        return this;
    }

    @Override
    public Regex _(String patternStr) {
        regexItemList.add(new RegexStringItem(patternStr));
        return this;
    }

    @Override
    public Regex withRegex(Regex regex) {
        paste(regex);
        return this;
    }

    @Override
    public Regex _(Regex regex) {
        paste(regex);
        return this;
    }

    @Override
    public Regex getRegEx() {
        return this;
    }

    @Override
    public Regex zeroOrMoreTime() {
        regexItemList.add(new RegexStringItem("*"));
        return this;
    }


    @Override
    public Regex startGrp() {
        regexItemList.add(new RegexStringItem("("));
        return this;
    }

    @Override
    public Regex endGrp() {
        regexItemList.add(new RegexStringItem(")"));
        return this;
    }

    @Override
    public Context getContext() {
        Context context = new Context();
        regexItemList.getFirst().execute(context);
        return context;
    }




    private void paste(Regex regexToPaste) {
        RegexItem regexItem = ((RegexBuilder) regexToPaste).regexItemList.getFirst();
        while (regexItem != null) {
            regexItemList.add(regexItem);
            regexItem = regexItem.getNext();
        }
    }
}
