class DnDCharacter {

    private final iCharacterAttributeList attributeList;

    private DnDCharacter(iCharacterAttributeList attributeList) {

        this.attributeList = attributeList;
    }

    DnDCharacter() {
        this(new CharacterAttributeList());
    }

    iCharacterAttributeList attributes() {

        return attributeList;
    }
}
