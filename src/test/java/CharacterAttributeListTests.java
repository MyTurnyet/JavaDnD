import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CharacterAttributeListTests {
    @Test
    public void should_HaveStrengthAttribute() {
        //arrange
        iCharacterAttribute expectedStr = new DnDAttribute(10);
        CharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        iCharacterAttribute actualStr = attributeList.strength();

        //assert
        assertThat(actualStr).isEqualTo(expectedStr);
    }
    @Test
    public void should_HaveDexterityAttribute() {
        //arrange
        iCharacterAttribute expectedDex = new DnDAttribute(10);
        CharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        iCharacterAttribute actualDex = attributeList.dexterity();

        //assert
        assertThat(actualDex).isEqualTo(expectedDex);
    }
    @Test
    public void should_HaveConstitutionAttribute() {
        //arrange
        iCharacterAttribute expectedCon = new DnDAttribute(10);
        CharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        iCharacterAttribute actualCon = attributeList.constitution();

        //assert
        assertThat(actualCon).isEqualTo(expectedCon);
    }
    @Test
    public void should_HaveIntelligenceAttribute() {
        //arrange
        iCharacterAttribute expectedInt = new DnDAttribute(10);
        CharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        iCharacterAttribute actualInt = attributeList.intelligence();

        //assert
        assertThat(actualInt).isEqualTo(expectedInt);
    }
    @Test
    public void should_HaveWisdomAttribute() {
        //arrange
        iCharacterAttribute expectedWis = new DnDAttribute(10);
        CharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        iCharacterAttribute actualWis = attributeList.wisdom();

        //assert
        assertThat(actualWis).isEqualTo(expectedWis);
    }
    @Test
    public void should_HaveCharismaAttribute() {
        //arrange
        iCharacterAttribute expectedChr = new DnDAttribute(10);
        CharacterAttributeList attributeList = new CharacterAttributeList();
        //act
        iCharacterAttribute actualChr = attributeList.charisma();

        //assert
        assertThat(actualChr).isEqualTo(expectedChr);
    }
}
