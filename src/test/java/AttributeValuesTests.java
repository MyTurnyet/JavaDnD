import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AttributeValuesTests {
    @Test
    public void should_Equate() {
        //arrange
        final iAttributeValue attributeValue1 = new AttributeValue(10);
        final iAttributeValue attributeValue2 = new AttributeValue(10);

        //act
        //assert
        assertThat(attributeValue1).isEqualTo(attributeValue2);
    }

    @Test
    public void should_EquateWithDefault() {
        //arrange
        final iAttributeValue attributeValue1 = new AttributeValue();
        final iAttributeValue attributeValue2 = new AttributeValue();

        //act
        //assert
        assertThat(attributeValue1).isEqualTo(attributeValue2);
    }

    @Test
    public void should_NotEquate() {
        //arrange
        final iAttributeValue attributeValue1 = new AttributeValue(10);
        final iAttributeValue attributeValue2 = new AttributeValue();

        //act
        //assert
        assertThat(attributeValue1).isNotEqualTo(attributeValue2);
    }

    @Test
    public void should_SumValues() {
        //arrange
        final iAttributeValue attributeValue1 = new AttributeValue(10);
        final AttributeValue attributeValue2 = new AttributeValue(2);
        final iAttributeValue expectedValue = new AttributeValue(12);

        //act
        final iAttributeValue outputValue = attributeValue1.addValue(attributeValue2);
        //assert
        assertThat(expectedValue).isEqualTo(outputValue);
    }

    @Test
    public void should_SumValues_WhenNegative() {
        //arrange
        final iAttributeValue attributeValue1 = new AttributeValue(10);
        final AttributeValue attributeValue2 = new AttributeValue(-2);
        final iAttributeValue expectedValue = new AttributeValue(8);

        //act
        final iAttributeValue outputValue = attributeValue1.addValue(attributeValue2);
        //assert
        assertThat(expectedValue).isEqualTo(outputValue);
    }
}