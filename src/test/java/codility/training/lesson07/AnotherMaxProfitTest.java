package codility.training.lesson07;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jsi on 2015-11-06.
 */
public class AnotherMaxProfitTest {

    private AnotherMaxProfit sut = new AnotherMaxProfit();

    @Test
    public void codilityExampleTest() throws Exception {
        //given
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(356);
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
    public void onePositiveElement() throws Exception {
        //given
        int[] A = {22112};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void largerNumbersAndArray() throws Exception {
        //given
        int[] A = {10005, 9600, 9988, 9701, 9749, 10300, 10016, 9995, 9990, 10044, 10000, 9989, 10005, 9766, 10301};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(10301 - 9600);
    }
}