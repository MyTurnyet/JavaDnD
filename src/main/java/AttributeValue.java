public class AttributeValue implements iAttributeValue {
    private final int value;

    AttributeValue(int defaultValue) {

        value = defaultValue;
    }

    AttributeValue() {
        this(0);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof AttributeValue) && ((AttributeValue) obj).value == this.value;
    }

    public iAttributeValue addValue(AttributeValue valueToAdd) {
        final int sum = valueToAdd.value + this.value;
        return new AttributeValue(sum);
    }

}
