public class CharacterAttributeList implements iCharacterAttributeList {

    private final iCharacterAttribute strength;
    private final iCharacterAttribute dexterity;
    private final iCharacterAttribute constitution;
    private final iCharacterAttribute intelligence;
    private final iCharacterAttribute wisdom;
    private final iCharacterAttribute charisma;


    private CharacterAttributeList(iCharacterAttribute strength, iCharacterAttribute dexterity, iCharacterAttribute constitution,
                                   iCharacterAttribute intelligence, iCharacterAttribute wisdom, iCharacterAttribute charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    private CharacterAttributeList(iAttributeValue defaultValue) {
        this(new DnDAttribute(defaultValue), new DnDAttribute(defaultValue), new DnDAttribute(defaultValue),
                new DnDAttribute(defaultValue), new DnDAttribute(defaultValue), new DnDAttribute(defaultValue));
    }

    CharacterAttributeList() {
        this(new AttributeValue(10));
    }

    public iCharacterAttribute strength() {
        return strength;
    }

    public iCharacterAttribute dexterity() {
            return dexterity;
    }

    public iCharacterAttribute constitution() {
        return constitution;
    }

    public iCharacterAttribute intelligence() {
        return intelligence;
    }

    public iCharacterAttribute wisdom() {
        return wisdom;
    }

    public iCharacterAttribute charisma() {
        return charisma;
    }
}
