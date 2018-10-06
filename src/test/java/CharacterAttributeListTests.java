import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CharacterAttributeListTests {
    @Test
    public void should_HaveStrengthAttribute() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute expectedStr = new DnDAttribute(baseValue);
        final AttributeList attributeList = new CharacterAttributeList();
        //act
        final CharacterAttribute actualStr = attributeList.strength();

        //assert
        assertThat(actualStr).isEqualTo(expectedStr);
    }

    @Test
    public void should_HaveDexterityAttribute() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute expectedDex = new DnDAttribute(baseValue);
        final AttributeList attributeList = new CharacterAttributeList();
        //act
        final CharacterAttribute actualDex = attributeList.dexterity();

        //assert
        assertThat(actualDex).isEqualTo(expectedDex);
    }

    @Test
    public void should_HaveConstitutionAttribute() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute expectedCon = new DnDAttribute(baseValue);
        final AttributeList attributeList = new CharacterAttributeList();
        //act
        final CharacterAttribute actualCon = attributeList.constitution();

        //assert
        assertThat(actualCon).isEqualTo(expectedCon);
    }

    @Test
    public void should_HaveIntelligenceAttribute() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute expectedInt = new DnDAttribute(baseValue);
        final AttributeList attributeList = new CharacterAttributeList();
        //act
        final CharacterAttribute actualInt = attributeList.intelligence();

        //assert
        assertThat(actualInt).isEqualTo(expectedInt);
    }

    @Test
    public void should_HaveWisdomAttribute() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute expectedWis = new DnDAttribute(baseValue);
        final AttributeList attributeList = new CharacterAttributeList();
        //act
        final CharacterAttribute actualWis = attributeList.wisdom();

        //assert
        assertThat(actualWis).isEqualTo(expectedWis);
    }

    @Test
    public void should_HaveCharismaAttribute() {
        //arrange
        final AttributeScore baseValue = new CharacterAttributeScore(10);
        final CharacterAttribute expectedChr = new DnDAttribute(baseValue);
        final AttributeList attributeList = new CharacterAttributeList();
        //act
        final CharacterAttribute actualChr = attributeList.charisma();

        //assert
        assertThat(actualChr).isEqualTo(expectedChr);
    }
}
