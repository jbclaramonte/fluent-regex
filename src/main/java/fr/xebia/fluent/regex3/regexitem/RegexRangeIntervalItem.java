package fr.xebia.fluent.regex3.regexitem;


import fr.xebia.fluent.regex3.Context;

import static fr.xebia.fluent.utils.LogicUtils.isNot;

public abstract class RegexRangeIntervalItem extends RegexRangeItem {

    protected Character from;
    protected Character to;

    public RegexRangeIntervalItem(Character from, Character to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void apply(Context context) {
        if (previous instanceof RegexRangeAndItem) {
            context.patternBuffer.append(getFlag() + from + "-" + to);
        } else {
            context.patternBuffer.append("[" + getFlag() + from + "-" + to);
        }

        if (isNot(next instanceof RegexRangeItem) && isNot(next instanceof RegexRangeAndItem)) {
            context.patternBuffer.append("]");
        }
    }

    public abstract String getFlag();

}
