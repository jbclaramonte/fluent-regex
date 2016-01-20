package fr.xebia.fluent.regex3;

import fr.xebia.fluent.regex3.range.RangeDsl;
import fr.xebia.fluent.regex3.regexitem.RegexRangeAndItem;

public class RangePatternImpl implements RangePattern {

    private RegexBuilder patternBuilder;

    public RangePatternImpl(RegexBuilder patternBuilder) {
        this.patternBuilder = patternBuilder;
    }


    @Override
    public Regex and() {
        patternBuilder.regexItemList.add(new RegexRangeAndItem());
        return patternBuilder;
    }

//    public RangePattern withRange(Character from, Character to) {
//        return patternBuilder.withRange(from, to);
//    }
//
//    public RangePattern withoutRange(Character from, Character to) {
//        return patternBuilder.withoutRange(from, to);
//    }
//
//    @Override
//    public RangePattern withChars(CharSequence chars) {
//        return patternBuilder.withChars(chars);
//    }


    @Override
    public Regex withStartOfLine() {
        return patternBuilder.withStartOfLine();
    }

    @Override
    public Context getContext() {
        return patternBuilder.getContext();
    }

    @Override
    public Regex getRegEx() {
        return patternBuilder.getRegEx();
    }

    @Override
    public Regex with(String patternStr) {
        return patternBuilder.with(patternStr);
    }

    @Override
    public Regex withRegex(Regex regex) {
        return patternBuilder.withRegex(regex);
    }

    @Override
    public Regex zeroOrMoreTime() {
        return patternBuilder.zeroOrMoreTime();
    }

    @Override
    public Regex with(RangeDsl rangeDsl) {
        return patternBuilder.with(rangeDsl);
    }

    @Override
    public Regex _(RangeDsl rangeDsl) {
        return patternBuilder._(rangeDsl);
    }

    @Override
    public Regex _(Regex regex) {
        return patternBuilder._(regex);
    }

    @Override
    public Regex _(String patternStr) {
        return patternBuilder._(patternStr);
    }

    @Override
    public Regex startGrp() {
        return patternBuilder.startGrp();
    }

    @Override
    public Regex endGrp() {
        return patternBuilder.endGrp();
    }
}
