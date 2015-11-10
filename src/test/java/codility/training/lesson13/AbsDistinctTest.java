package codility.training.lesson13;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 10.11.2015
 */
public class AbsDistinctTest {

    private AbsDistinct sut = new AbsDistinct();

    @Test
    public void shouldHandleOnlyNegatives() {
        //given
        int[] A = {-7, -4, -2, -2, -1};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shouldHandleOnlyDistinctPositives() {
        //given
        int[] A = {0, 1, 2, 3, 4, 8};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void shouldHandleRepeatingPositives() {
        //given
        int[] A = {0, 1, 2, 4, 4, 8};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shouldHandleMixOfDistinctNegativesAndPositives() {
        //given
        int[] A = {-10, -8, -3, 1, 2, 4, 25};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void shouldHandleMixOfRepeatingNegativesAndPositives() {
        //given
        int[] A = {-10, -3, -1, 1, 1, 3, 5, 25};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shouldReturn1OnSingleElemArray() {
        //given
        int[] A = {1};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn1OnSameNegativesAndPositives() {
        //given
        int[] A = {-1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(1);
    }

}