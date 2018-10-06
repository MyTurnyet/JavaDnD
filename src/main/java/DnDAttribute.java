public class DnDAttribute implements CharacterAttribute {
    private final AttributeScore value;

    DnDAttribute(AttributeScore defaultValue) {
        value = defaultValue;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof DnDAttribute) && (((DnDAttribute) obj).value.equals(this.value));
    }
}
