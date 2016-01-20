package fr.xebia.fluent.regex3.range;

import fr.xebia.fluent.regex3.regexitem.RegexRangeWithIntervalItem;

public class RangeToDslBuilder implements RangeToDsl, RangeDsl {

    private RangeDslBuilder rangeDslBuilder;
    private Character from;

    public RangeToDslBuilder(RangeDslBuilder rangeDslBuilder, Character from) {
        this.rangeDslBuilder = rangeDslBuilder;
        this.from = from;
    }

    @Override
    public RangeUnionDsl to(Character to) {
        rangeDslBuilder.regexItemList.add(new RegexRangeWithIntervalItem(from, to));
        return new RangeUnionDslBuilder(this.rangeDslBuilder);
    }

    //
    // delegate methods for RangeDsl interface :
    //

    @Override
    public RangeToDsl from(Character from) {
        return rangeDslBuilder.from(from);
    }

    @Override
    public RangeDsl chars(CharSequence chars) {
        return rangeDslBuilder.chars(chars);
    }

    @Override
    public RangeUnionDsl a_TO_z() {
        return rangeDslBuilder.a_TO_z();
    }
}
