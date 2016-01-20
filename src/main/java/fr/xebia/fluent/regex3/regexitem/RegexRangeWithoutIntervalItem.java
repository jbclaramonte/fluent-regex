package fr.xebia.fluent.regex3.regexitem;


public class RegexRangeWithoutIntervalItem extends RegexRangeIntervalItem {

    public RegexRangeWithoutIntervalItem(Character from, Character to) {
        super(from, to);
    }

    @Override
    public String getFlag() {
        return "^";
    }
}
