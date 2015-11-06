package codility.training.lesson7maxslice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicMaximumSliceTest {

    private BasicMaximumSlice sut = new BasicMaximumSlice();

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
    public void emptyArray() throws Exception {
        //given
        int[] A = {};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void oneNegativeElement() throws Exception {
        //given
        int[] A = {-256};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
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