package fr.xebia.fluent.regex2;

public class RangePatternImpl implements RangePattern {

    private PatternBuilder patternBuilder;

    public RangePatternImpl(PatternBuilder patternBuilder) {
        this.patternBuilder = patternBuilder;
    }


    @Override
    public Pattern and() {
        patternBuilder.commands.remove(patternBuilder.commands.size() - 1);
        return patternBuilder;
    }

    public RangePattern withRange(Character from, Character to) {
        return patternBuilder.withRange(from, to);
    }

    public RangePattern withoutRange(Character from, Character to) {
        return patternBuilder.withoutRange(from, to);
    }

    @Override
    public RangePattern withChars(CharSequence chars) {
        return patternBuilder.withChars(chars);
    }

    @Override
    public Pattern startWith(Pattern pattern) {
        return patternBuilder.startWith(pattern);
    }

    @Override
    public String toString() {
        return patternBuilder.toString();
    }
}
