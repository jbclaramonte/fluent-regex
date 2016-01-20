package fr.xebia.fluent.regex2;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoveLeftCmd implements Command {

    public void execute(PatternString ps) {
        ps.cursor = ps.cursor - 1;
    }
}
