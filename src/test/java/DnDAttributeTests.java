
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DnDAttributeTests {
    @Test
    public void shouldReturn0ForAttributeValue() {
        final AttributeScore baseValue = new CharacterAttributeScore(0);
        final CharacterAttribute attribute1 = new DnDAttribute(baseValue);
        final CharacterAttribute attribute2 = new DnDAttribute(baseValue);
        assertThat(attribute1).isEqualTo(attribute2);
    }

    @Test
    public void should_ReturnValueOf_10() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute attribute1 = new DnDAttribute(baseValue);
        final CharacterAttribute attribute2 = new DnDAttribute(baseValue);
        //act
        assertThat(attribute1).isEqualTo(attribute2);
    }

    @Test
    public void should_Equate() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute attribute1 = new DnDAttribute(baseValue);
        final CharacterAttribute attribute2 = new DnDAttribute(baseValue);
        //act
        //assert
        assertThat(attribute1).isEqualTo(attribute2);
    }
}
