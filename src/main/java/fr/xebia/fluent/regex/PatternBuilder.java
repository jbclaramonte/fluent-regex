package fr.xebia.fluent.regex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class PatternBuilder implements Pattern, CharacterRangePatternStart {

    StringBuffer patternStr = new StringBuffer();
    
    List<Command> commands = new ArrayList<Command>();
    
    
    public static Pattern build() {
        return new PatternBuilder();
    }

    @Override
    public CharacterRangePatternEnd from(Character from) {
        patternStr.append(from);
        commands.add(new WriteStringCmd(String.valueOf(from)));
        return new CharacterRangePatternEndImpl(this);
    }

    @Override
    public CharacterRangePatternStart withRange() {
        commands.add(new WriteStringCmd("["));
        patternStr.append("[");
        return this;
    }

    @Override
    public CharacterRangePatternStart withoutRange() {
        commands.add(new WriteStringCmd("[^"));
        patternStr.append("[^");
        return this;
    }

    

    @Override
    public String toString() {
//        return patternStr.toString();
        PatternString ps = new PatternString();
        for (Command command : commands) {
            command.execute(ps);
        }

        return ps.getPatternString();
    }

}
