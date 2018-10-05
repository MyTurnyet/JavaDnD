public class DnDAttribute implements iCharacterAttribute {
    private final iAttributeValue value;

    DnDAttribute(iAttributeValue defaultValue) {
        value = defaultValue;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof DnDAttribute) && (((DnDAttribute) obj).value.equals(this.value));
    }
}
