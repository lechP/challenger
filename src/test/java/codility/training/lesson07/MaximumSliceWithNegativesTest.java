package codility.training.lesson07;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 06.11.2015
 */
public class MaximumSliceWithNegativesTest {

    private MaximumSliceWithNegatives sut = new MaximumSliceWithNegatives();

    @Test
    public void codilityExampleTest() throws Exception {
        //given
        int[] A = {5, -7, 3, 5, -2, 4, -1};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void oneNegativeElement() throws Exception {
        //given
        int[] A = {-256};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(-256);
    }

    @Test
    public void manyNegativeElements() throws Exception {
        //given
        int[] A = {-256, -10, -44, -1, -100, -321};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void onePositiveElement() throws Exception {
        //given
        int[] A = {100};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void largerNumbersAndArray() throws Exception {
        //given
        int[] A = {5, 10, -12, 44, -251, 312, 16, -5, -10, 44, 0, -11, 5, -234, 122}; //maxslice from 312 to 44
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(312 + 16 - 5 - 10 + 44);
    }

}