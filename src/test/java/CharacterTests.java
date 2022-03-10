
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharacterTests {

    @Test
    public void should_HaveAttributeList() {
        //arrange
        final DnDCharacter character = new DnDCharacter();
        //act
        final AttributeList attributeList = character.attributes();
        //assert
        assertThat(attributeList).isNotNull();
    }
}
