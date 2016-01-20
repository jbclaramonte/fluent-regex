package fr.xebia.fluent.regex3.regexitem;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/24/14
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegexItemList {

    private RegexItem first;
    private RegexItem last;

    public void add(RegexItem current) {
        if (first == null) {
            first = current;
        }
        current.setPrevious(last);
        if (last != null) {
            last.setNext(current);
        }
        last = current;
    }

    public RegexItem getFirst() {
        return first;
    }

    public RegexItem getLast() {
        return last;
    }
}
