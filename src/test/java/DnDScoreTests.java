import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DnDScoreTests {
    @Test
    public void should_Equate() {
        //arrange
        final Score score1 = new DnDScore(10);
        final Score score2 = new DnDScore(10);
        //act
        //assert
        assertThat(score1).isEqualTo(score2);
    }

    @Test
    public void should_NotEquate() {
        //arrange
        final Score score1 = new DnDScore(5);
        final Score score2 = new DnDScore(10);
        //act
        //assert
        assertThat(score1).isNotEqualTo(score2);
    }

    @Test
    public void should_AddValues() {
        //arrange
        final Score score1 = new DnDScore(5);
        final DnDScore score2 = new DnDScore(10);
        final Score expectedScore = new DnDScore(15);

        //act
        final Score actualScore = score1.add(score2);
        //assert
        assertThat(expectedScore).isEqualTo(actualScore);
    }

}