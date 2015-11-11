package codility.training.lesson14;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 11.11.2015
 */
public class MaxNonoverlappingSegmentsTest {

    private MaxNonoverlappingSegments sut = new MaxNonoverlappingSegments();

    @Test
    public void codilityTest() {
        //given
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldHandleEmptyArrays() {
        //given
        int[] A = {};
        int[] B = {};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldNotRemoveSingleElement() {
        //given
        int[] A = {1};
        int[] B = {13};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldAllElementsRemain() {
        //given
        int[] A = {0, 2, 100};
        int[] B = {0, 50, 1000};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldHandleMaxSizeArray() {
        //given
        int[] A = IntStream.range(0, 30_000).map(i -> i).toArray();
        int[] B = IntStream.range(0, 30_000).map(i -> i+1).toArray();
        //when
        int result = sut.solution(A, B);
        //then
        int halfOfElements = 15_000;
        assertThat(result).isEqualTo(halfOfElements);
    }

}