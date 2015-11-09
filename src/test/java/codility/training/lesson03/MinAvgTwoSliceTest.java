package codility.training.lesson03;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinAvgTwoSliceTest {

    private MinAvgTwoSlice sut = new MinAvgTwoSlice();

    @Test
    public void ShouldReturnZeroForTwoElementArray() throws Exception {
        //given
        int[] A = new int[]{57, -222};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void ShouldReturnFiveForTwoElementMinAvg() throws Exception {
        //given (min for 1,1)
        int[] A = new int[]{5, 1, 3, 2, 10, 1, 1};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void ShouldReturnOneForThreeElementMinAvg() throws Exception {
        //given (min for 1,10,1)
        int[] A = new int[]{10, 1, 10, 1, 10, 1, 10, 1, 10};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void ShouldReturnOneWhenThreeElementsMinAvgIsPlacedSomwhereElseThanTwoElementsMinAvg() throws Exception {
        //given (min for 1,10,1)
        int[] A = new int[]{10, 2, 10, 1, 10, 1, 10, 1, 10};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void ShouldReturnFiveForTwoElementMinAvgSurroundedByMuchBiggerNumbers() throws Exception {
        //given (min for 1,1)
        int[] A = new int[]{327, 15, 15, 17, 20, 1, 1, 15, 2, 2, 2, 2, 2};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void ShouldReturnTwoForLargeAndNegativeNumbers() throws Exception {
        //given (min for -112,-888,-544)
        int[] A = new int[]{-452, 777, -500, -444, -544, 127, 242, 167, 511, -201};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }


}