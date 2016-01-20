package fr.xebia.fluent.regex;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterRangePatternEndImpl implements CharacterRangePatternEnd {

    private PatternBuilder parentPatternBuilder;

    public CharacterRangePatternEndImpl(PatternBuilder parentPatternBuilder) {
        this.parentPatternBuilder = parentPatternBuilder;
    }

    @Override
    public CharacterRangePatternEnd to(Character to) {
        parentPatternBuilder.patternStr.append("-").append(to).append("]");
        parentPatternBuilder.commands.add(new WriteStringCmd("-" + to));
        parentPatternBuilder.commands.add(new WriteStringCmd("]"));
        return this;
    }

    @Override
    public Pattern and() {
        parentPatternBuilder.commands.add(new MoveLeftCmd());
        return parentPatternBuilder;
    }

    @Override
    public CharacterRangePatternStart withRange() {
        return parentPatternBuilder.withRange();
    }

    @Override
    public CharacterRangePatternStart withoutRange() {
        return parentPatternBuilder.withoutRange();
    }
}
