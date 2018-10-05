public class DnDAttribute implements iCharacterAttribute {
    private final int value;

    public DnDAttribute() {
        this(0);
    }

    public DnDAttribute(int defaultValue) {
        value = defaultValue;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof DnDAttribute) && (((DnDAttribute) obj).value == value);
    }
}
