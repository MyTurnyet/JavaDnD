import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AttributeBonusTests {
    @Test
    public void should_Equate() {
        //arrange
        final AttributeBonus attributeBonus1 = new AttributeBonus(2);
        final AttributeBonus attributeBonus2 = new AttributeBonus(2);
        //act
        //assert
        assertThat(attributeBonus1).isEqualTo(attributeBonus2);
    }

    @Test
    public void should_NotEquate() {
        //arrange
        final AttributeBonus attributeBonus1 = new AttributeBonus(3);
        final AttributeBonus attributeBonus2 = new AttributeBonus(4);
        //act
        //assert
        assertThat(attributeBonus1).isNotEqualTo(attributeBonus2);
    }

    @Test
    public void should_ReturnBonusPlusBaseScore() {
        //arrange
        final AttributeBonus bonus = new AttributeBonus(3);
        final CharacterAttributeScore baseScore = new CharacterAttributeScore(10);
        Score score = new DnDScore(13);
        //act
        Score actualScore = bonus.applyToScore(baseScore);
        // assert
        assertThat(actualScore).isEqualTo(score);
    }
}