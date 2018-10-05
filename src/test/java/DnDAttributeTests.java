import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DnDAttributeTests {
    @Test
    public void shouldReturn0ForAttributeValue() {
        final iAttributeValue baseValue = new AttributeValue(0);
        final iCharacterAttribute attribute1 = new DnDAttribute(baseValue);
        final iCharacterAttribute attribute2 = new DnDAttribute(baseValue);
        assertThat(attribute1).isEqualTo(attribute2);
    }

    @Test
    public void should_ReturnValueOf_10() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute attribute1 = new DnDAttribute(baseValue);
        final iCharacterAttribute attribute2 = new DnDAttribute(baseValue);
        //act
        assertThat(attribute1).isEqualTo(attribute2);
    }

    @Test
    public void should_Equate() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute attribute1 = new DnDAttribute(baseValue);
        final iCharacterAttribute attribute2 = new DnDAttribute(baseValue);
        //act
        //assert
        assertThat(attribute1).isEqualTo(attribute2);
    }
}
