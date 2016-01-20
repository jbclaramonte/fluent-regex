package fr.xebia.fluent.regex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class PatternBuilder implements Pattern {

    List<Command> commands = new ArrayList<Command>();


    public static Pattern build() {
        return new PatternBuilder();
    }

    @Override
    public RangePattern withRange(Character from, Character to) {
        commands.add(new WriteStringCmd("["));
        commands.add(new WriteStringCmd(String.valueOf(from)));
        commands.add(new WriteStringCmd(","));
        commands.add(new WriteStringCmd(String.valueOf(to)));
        commands.add(new WriteStringCmd("]"));
        return new RangePatternImpl(this);
    }

    @Override
    public RangePattern withoutRange(Character from, Character to) {
        commands.add(new WriteStringCmd("[^"));
        commands.add(new WriteStringCmd(String.valueOf(from)));
        commands.add(new WriteStringCmd(","));
        commands.add(new WriteStringCmd(String.valueOf(to)));
        commands.add(new WriteStringCmd("]"));
        return new RangePatternImpl(this);
    }

    @Override
    public RangePattern withChars(CharSequence chars) {
        commands.add(new WriteStringCmd("["));
        commands.add(new WriteStringCmd(String.valueOf(chars)));
        commands.add(new WriteStringCmd("]"));
        return new RangePatternImpl(this);
    }

    @Override
    public Pattern startWith(Pattern pattern) {
        commands.add(new WriteStringCmd(pattern.toString()));
        return this;
    }

    @Override
    public String toString() {
        PatternString ps = new PatternString();
        for (Command command : commands) {
            command.execute(ps);
        }

        return ps.getPatternString();
    }

}
