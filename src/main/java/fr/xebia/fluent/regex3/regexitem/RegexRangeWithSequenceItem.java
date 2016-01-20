package fr.xebia.fluent.regex3.regexitem;

public class RegexRangeWithSequenceItem extends RegexRangeSequenceItem {

    public RegexRangeWithSequenceItem(CharSequence charSequence) {
        super(charSequence);
    }

    @Override
    public String getFlag() {
        return "";
    }
}
