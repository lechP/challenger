package codility.training;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogTest {

    private Frog sut = new Frog();

    @Test
    public void shouldReturnSix() throws Exception {
        //given
        int X = 5;
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        //when
        int result = sut.solution(X, A);
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
     public void shouldReturnMinusOneWhenOneLeafIsMissing() throws Exception {
        //given
        int X = 5;
        int[] A = new int[]{1, 3, 1, 4, 1, 3, 5, 4};
        //when
        int result = sut.solution(X, A);
        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void shouldReturnZeroForOnePossibleLeaf() throws Exception {
        //given
        int X = 1;
        int[] A = new int[]{1, 1, 1, 1, 1};
        //when
        int result = sut.solution(X, A);
        //then
        assertThat(result).isEqualTo(0);
    }
}