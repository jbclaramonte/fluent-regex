package fr.xebia.fluent.regex3.regexitem;


import fr.xebia.fluent.regex3.Context;

import static fr.xebia.fluent.utils.LogicUtils.isNot;

public abstract class RegexRangeSequenceItem extends RegexRangeItem {

    protected CharSequence charSequence;

    public RegexRangeSequenceItem(CharSequence charSequence) {
        this.charSequence = charSequence;
    }

    @Override
    public void apply(Context context) {
        if (previous instanceof RegexRangeAndItem) {
            context.patternBuffer.append(getFlag() + charSequence);
        } else {
            context.patternBuffer.append("[" + getFlag() + charSequence);
        }

        if (isNot(next instanceof RegexRangeItem) && isNot(next instanceof RegexRangeAndItem)) {
            context.patternBuffer.append("]");
        }
    }

    public abstract String getFlag();

}
