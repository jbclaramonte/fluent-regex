package fr.xebia.fluent.regex3.range;

import fr.xebia.fluent.regex3.Context;
import fr.xebia.fluent.regex3.regexitem.RegexItemList;

public class RangeDslBuilder implements RangeDsl {

    public RegexItemList regexItemList = new RegexItemList();

    public static RangeDsl range() {
        return new RangeDslBuilder();
    }

    @Override
    public RangeToDsl from(Character from) {
        return new RangeToDslBuilder(this, from);
    }

    @Override
    public RangeDsl chars(CharSequence chars) {
        // TODO ajouter le code qui va bien ici
        return this;
    }

    public RangeUnionDsl a_TO_z() {
        return from('a').to('z');
    }


    @Override
    public String toString() {
        Context context = new Context();
        regexItemList.getFirst().execute(context);
        return context.patternBuffer.toString();
    }
}
