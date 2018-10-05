import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CharacterAttributeListTests {
    @Test
    public void should_HaveStrengthAttribute() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute expectedStr = new DnDAttribute(baseValue);
        final iCharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        final iCharacterAttribute actualStr = attributeList.strength();

        //assert
        assertThat(actualStr).isEqualTo(expectedStr);
    }

    @Test
    public void should_HaveDexterityAttribute() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute expectedDex = new DnDAttribute(baseValue);
        final iCharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        final iCharacterAttribute actualDex = attributeList.dexterity();

        //assert
        assertThat(actualDex).isEqualTo(expectedDex);
    }

    @Test
    public void should_HaveConstitutionAttribute() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute expectedCon = new DnDAttribute(baseValue);
        final iCharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        final iCharacterAttribute actualCon = attributeList.constitution();

        //assert
        assertThat(actualCon).isEqualTo(expectedCon);
    }

    @Test
    public void should_HaveIntelligenceAttribute() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute expectedInt = new DnDAttribute(baseValue);
        final iCharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        final iCharacterAttribute actualInt = attributeList.intelligence();

        //assert
        assertThat(actualInt).isEqualTo(expectedInt);
    }

    @Test
    public void should_HaveWisdomAttribute() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute expectedWis = new DnDAttribute(baseValue);
        final iCharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        final iCharacterAttribute actualWis = attributeList.wisdom();

        //assert
        assertThat(actualWis).isEqualTo(expectedWis);
    }

    @Test
    public void should_HaveCharismaAttribute() {
        //arrange
        final iAttributeValue baseValue = new AttributeValue(10);
        final iCharacterAttribute expectedChr = new DnDAttribute(baseValue);
        final iCharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        final iCharacterAttribute actualChr = attributeList.charisma();

        //assert
        assertThat(actualChr).isEqualTo(expectedChr);
    }
}
