import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class CharacterTests {

    @Test
    public void should_HaveAttributeList() {
        //arrange
        CharacterAttributeList characterAttributeList = new CharacterAttributeList();
        DnDCharacter character = new DnDCharacter();
        //act
        iCharacterAttributeList attributeList = character.attributes();
        //assert
        assertThat(attributeList).isNotNull();
    }
}
