package fr.xebia.fluent.regex;


public interface CharacterRangePatternEnd extends Pattern {

    CharacterRangePatternEnd to(Character from);
    Pattern and();

}
