package fr.xebia.fluent.regex2;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class WriteStringCmd implements Command {

    private String str;

    public WriteStringCmd(String str) {
        this.str = str;
    }

    public void execute(PatternString ps) {
        ps.value.add(ps.cursor, str);
        ps.cursor = ps.cursor + 1;
    }


}
