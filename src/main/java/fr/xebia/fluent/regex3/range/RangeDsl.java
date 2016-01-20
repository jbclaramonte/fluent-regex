package fr.xebia.fluent.regex3.range;

public interface RangeDsl {
    RangeToDsl from(Character from);

    RangeDsl chars(CharSequence chars);


    RangeUnionDsl a_TO_z();
}
