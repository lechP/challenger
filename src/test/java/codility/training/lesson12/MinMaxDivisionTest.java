package codility.training.lesson12;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 10.11.2015
 */
public class MinMaxDivisionTest {

    MinMaxDivision sut = new MinMaxDivision();

    @Test
    public void shouldWorkWithCodilityTestData() throws Exception {
        //given
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int M = 5;
        int K = 3;
        //when
        int result = sut.solution(K, M, A);
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void shouldHandleSingleElemArray() throws Exception {
        //given
        int[] A = {33};
        int M = 33;
        int K = 3;
        //when
        int result = sut.solution(K, M, A);
        //then
        assertThat(result).isEqualTo(33);
    }

    @Test
    public void shouldReturnWholeSumForOneBlock() throws Exception {
        //given
        int[] A = {7, 33, 10, 15, 5, 24, 6};
        int M = 33;
        int K = 1;
        //when
        int result = sut.solution(K, M, A);
        //then
        assertThat(result).isEqualTo(100);
    }
}