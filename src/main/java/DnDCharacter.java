class DnDCharacter {

    private final AttributeList attributeList;

    private DnDCharacter(AttributeList attributeList) {

        this.attributeList = attributeList;
    }

    DnDCharacter() {
        this(new CharacterAttributeList());
    }

    AttributeList attributes() {

        return attributeList;
    }
}
