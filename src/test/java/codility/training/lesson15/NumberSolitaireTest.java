package codility.training.lesson15;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 13.11.2015
 */
public class NumberSolitaireTest {

    NumberSolitaire sut = new NumberSolitaire();

    @Test
    public void codilityTest() {
        //given
        int[] A = {1, -2, 0, 9, -1, -2};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void minSizeArray() {
        //given
        int[] A = {-14, -15};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(-29);
    }

    @Test
    public void shouldCatchAllPositiveElements() {
        //given
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(55);
    }

    @Test
    public void maxSizeArrayWithMaximalElements() {
        //given
        int[] A = IntStream.range(0, 100_000).map(i -> 10_000).toArray();
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(1_000_000_000);
    }

    @Test
    public void bigArrayWithMinimalElements() {
        //given
        int[] A = IntStream.range(0, 60_001).map(i -> -10_000).toArray();
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(-100_010_000);
    }

}