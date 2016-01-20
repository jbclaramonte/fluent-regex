package fr.xebia.fluent.regex3.regexitem;


public class RegexRangeWithIntervalItem extends RegexRangeIntervalItem {

    public RegexRangeWithIntervalItem(Character from, Character to) {
        super(from, to);
    }


    @Override
    public String getFlag() {
        return "";
    }
}
