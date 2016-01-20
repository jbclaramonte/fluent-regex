package fr.xebia.fluent.regex3.regexitem;

import fr.xebia.fluent.regex3.Context;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/24/14
 * Time: 5:36 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class RegexItem {

    protected RegexItem previous;
    protected RegexItem next;

    public RegexItem getPrevious() {
        return previous;
    }

    public void setPrevious(RegexItem previous) {
        this.previous = previous;
    }

    public RegexItem getNext() {
        return next;
    }

    public void setNext(RegexItem next) {
        this.next = next;
    }

    public abstract void apply(Context context);

    public void execute(Context context) {
        apply(context);
        if (next != null) {
            next.execute(context);
        }
    }
}
