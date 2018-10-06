public class CharacterAttributeList implements AttributeList {

    private final CharacterAttribute strength;
    private final CharacterAttribute dexterity;
    private final CharacterAttribute constitution;
    private final CharacterAttribute intelligence;
    private final CharacterAttribute wisdom;
    private final CharacterAttribute charisma;


    private CharacterAttributeList(CharacterAttribute strength, CharacterAttribute dexterity, CharacterAttribute constitution,
                                   CharacterAttribute intelligence, CharacterAttribute wisdom, CharacterAttribute charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    private CharacterAttributeList(AttributeScore defaultValue) {
        this(new DnDAttribute(defaultValue), new DnDAttribute(defaultValue), new DnDAttribute(defaultValue),
                new DnDAttribute(defaultValue), new DnDAttribute(defaultValue), new DnDAttribute(defaultValue));
    }

    CharacterAttributeList() {
        this(new CharacterAttributeScore(10));
    }

    public CharacterAttribute strength() {
        return strength;
    }

    public CharacterAttribute dexterity() {
            return dexterity;
    }

    public CharacterAttribute constitution() {
        return constitution;
    }

    public CharacterAttribute intelligence() {
        return intelligence;
    }

    public CharacterAttribute wisdom() {
        return wisdom;
    }

    public CharacterAttribute charisma() {
        return charisma;
    }
}
