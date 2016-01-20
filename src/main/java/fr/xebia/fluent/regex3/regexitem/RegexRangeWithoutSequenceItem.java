package fr.xebia.fluent.regex3.regexitem;

public class RegexRangeWithoutSequenceItem extends RegexRangeSequenceItem {

    public RegexRangeWithoutSequenceItem(CharSequence charSequence) {
        super(charSequence);
    }

    @Override
    public String getFlag() {
        return "^";
    }
}
