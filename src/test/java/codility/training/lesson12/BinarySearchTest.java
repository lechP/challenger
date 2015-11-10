package codility.training.lesson12;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 09.11.2015
 */
public class BinarySearchTest {

    BinarySearch sut = new BinarySearch();


    @Test
    public void shouldFindIndexOfSearchedValue() {
        //given
        int [] A = {1, 2, 3, 3, 5, 11, 12, 14, 14, 14, 17, 23, 26, 27, 31};
        int x = 17;
        //when
        int result = sut.solution(A, x);
        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void shouldReturnMinusOneWhenAllValuesAreGreater() {
        //given
        int [] A = {1, 2, 3, 3, 5, 11, 12, 14, 14, 14, 17, 23, 26, 27, 31};
        int x = -17;
        //when
        int result = sut.solution(A, x);
        //then
        assertThat(result).isEqualTo(-1);
    }

}