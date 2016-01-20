package fr.xebia.fluent.regex;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Pattern {

    CharacterRangePatternStart withRange();
    CharacterRangePatternStart withoutRange();

}
