package fr.xebia.fluent.regex3.regexitem;


import fr.xebia.fluent.regex3.Context;

public class RegexStringItem extends RegexItem {

    private String patternStr;

    public RegexStringItem(String patternStr) {
        this.patternStr = patternStr;
    }

    @Override
    public void apply(Context context) {
        context.patternBuffer.append(patternStr);
    }
}
