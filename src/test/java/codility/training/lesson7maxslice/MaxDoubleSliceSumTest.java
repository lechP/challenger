package codility.training.lesson7maxslice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 06.11.2015
 */
public class MaxDoubleSliceSumTest {

    private MaxDoubleSliceSum sut = new MaxDoubleSliceSum();

    @Test
    public void codilitySampleTest() throws Exception {
        //given
        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(17);
    }

    @Test
    public void minSizeArray() throws Exception {
        //given
        int[] A = {3, 2, 6};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void onlyNegatives() throws Exception {
        //given
        int[] A = {-5, -10, -3, -14, -13};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void onlyPositives() throws Exception {
        //given
        int[] A = {63, 11, 5, 2, 7, 23};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(23);
    }

    @Test
         public void onlyFourPositives() throws Exception {
        //given
        int[] A = {5, 17, 0, 3};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(17);
    }

    @Test
    public void onlyFourPositives2() throws Exception {
        //given
        int[] A = {5, 0, 17, 3};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(17);
    }

    @Test
    public void onlyTwoPositives() throws Exception {
        //given
        int[] A = {-5, -10, -3, 14, -13, 4, -3, -11, -5};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(14 + 4);
    }


    @Test
    public void trickyInputArray() throws Exception {
        //given
        int[] A = {-300, 1, 3, 4, 5, -2, 6, -40, 15, -200, 33};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(1 + 3 + 4 + 5 -2 + 6 + 15);
    }
    

}