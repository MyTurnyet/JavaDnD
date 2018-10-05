import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class DnDAttributeTests {
    @Test
    public void shouldReturn0ForAttributeValue(){
        iCharacterAttribute attribute1 = new DnDAttribute();
        iCharacterAttribute attribute2 = new DnDAttribute(0);
        assertThat(attribute1).isEqualTo(attribute2);
    }

    @Test
    public void should_ReturnValueOf_10() {
        //arrange
        iCharacterAttribute attribute1 = new DnDAttribute(10);
        iCharacterAttribute attribute2 = new DnDAttribute(10);
        //act
        assertThat(attribute1).isEqualTo(attribute2);
    }
}
