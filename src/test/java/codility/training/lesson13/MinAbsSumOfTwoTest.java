package codility.training.lesson13;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 11.11.2015
 */
public class MinAbsSumOfTwoTest {

    MinAbsSumOfTwo sut = new MinAbsSumOfTwo();

    @Test
    public void codilityTest() {
        //given
        int[] A = {-8, 4, 5, -10, 3};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldHandleOneElement() {
        //given
        int[] A = {3};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void shouldHandleOnlyPositives() {
        //given
        int[] A = {3, 17, 1, 24, 5, 19};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldHandleOnlyNegatives() {
        //given
        int[] A = {-3, -17, -1, -24, -5, -19};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroWhenArrayContainsZero() {
        //given
        int[] A = {0, 100, -34234, 42424};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldMatchNegativeWithPositiveElement() {
        //given
        int[] A = {-100, 100, 47, 82, 17, 25};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldHandleMaximalSizeArray() {
        //given
        int[] A = IntStream.range(0, 100_000).map(i -> 10_000*i).toArray();
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

}