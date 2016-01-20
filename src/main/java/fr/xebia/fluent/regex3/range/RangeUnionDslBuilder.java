package fr.xebia.fluent.regex3.range;

public class RangeUnionDslBuilder  implements RangeUnionDsl  {

    private RangeDslBuilder rangeDslBuilder;

    public RangeUnionDslBuilder(RangeDslBuilder rangeDslBuilder) {
        this.rangeDslBuilder = rangeDslBuilder;
    }

    @Override
    public RangeDsl or() {
        return rangeDslBuilder;
    }

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
