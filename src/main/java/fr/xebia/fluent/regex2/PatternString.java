package fr.xebia.fluent.regex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jbclaramonte
 * Date: 4/22/14
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PatternString {

    public List<String> value = new ArrayList<String>();
    public int cursor = 0;


    public String getPatternString() {
        StringBuffer sb = new StringBuffer();

        for (String s : value) {
            sb.append(s);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "PatternString{" +
                "value=" + value +
                ", cursor=" + cursor +
                '}';
    }
}
