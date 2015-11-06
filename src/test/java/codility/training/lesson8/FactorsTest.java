package codility.training.lesson8;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsi on 2015-11-06.
 */
public class FactorsTest {

    private Factors factors = new Factors();
    @Test
    public void codilityTest() throws Exception {
        //given
        int N = 24;
        //when
        int result = factors.solution(N);
        //then
        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    public void primeTest() throws Exception {
        //given
        int N = 7;
        //when
        int result = factors.solution(N);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void anotherPrimeTest() throws Exception {
        //given
        int N = 41;
        //when
        int result = factors.solution(N);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void squaredTest() throws Exception {
        //given
        int N = 16;
        //when
        int result = factors.solution(N);
        //then
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void oneTest() throws Exception {
        //given
        int N = 1;
        //when
        int result = factors.solution(N);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void maxIntTest() throws Exception {
        //given
        int N = Integer.MAX_VALUE;
        //when
        int result = factors.solution(N);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }
}