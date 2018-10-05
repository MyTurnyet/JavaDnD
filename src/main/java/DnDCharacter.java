public class DnDCharacter {

    private final iCharacterAttributeList attributeList;

    public DnDCharacter(iCharacterAttributeList attributeList) {

        this.attributeList = attributeList;
    }

    public DnDCharacter() {
        this(new CharacterAttributeList());
    }

    public iCharacterAttributeList attributes() {

        return attributeList;
    }
}
