package codility.training.lesson13;

import org.junit.Test;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 11.11.2015
 */
public class CountDistinctSlicesTest {

    CountDistinctSlices sut = new CountDistinctSlices();

    @Test
    public void codilityTest() {
        //given
        int[] A = {3, 4, 5, 5, 2};
        //when
        int result = sut.solution(6, A);
        //then
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void shouldReturnOneForOneElemArray() {
        //given
        int[] A = {3};
        //when
        int result = sut.solution(6, A);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnNForNSameElements() {
        //given
        int[] A = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //when
        int result = sut.solution(6, A);
        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void shouldReturn55For10DistinctElems() {
        //given
        int[] A = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        //when
        int result = sut.solution(10, A);
        //then
        assertThat(result).isEqualTo(55);
    }

    @Test
    public void maxSizeDistinctNumbers() {
        //given
        int[] A = new int[100_000];
        for (int i = 0; i < A.length; i++) {
            A[i]=i;
        }
        //when
        int result = sut.solution(100_000, A);
        //then
        assertThat(result).isEqualTo(1_000_000_000);
    }



}