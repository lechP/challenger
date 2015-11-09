package codility.training.lesson09;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

/**
 * Created by LPI on 07.11.2015
 */
public class SemiPrimesTest {

    private SemiPrimes.InnerSolution innerSolution;
    private SemiPrimes semiPrimes = new SemiPrimes();

    @Test
    public void testGetPrimeFactors() throws Exception {
        //given
        innerSolution = new SemiPrimes.InnerSolution(10, new int[0], new int[0]);
        //when
        List<Integer> primeFactors = innerSolution.getPrimeFactors(6);
        //then
        Assertions.assertThat(primeFactors).hasSize(2).contains(2).contains(3);
    }

    @Test
    public void testGetPrimeFactorsCodility() throws Exception {
        //given
        innerSolution = new SemiPrimes.InnerSolution(4, new int[0], new int[0]);
        //when
        List<Integer> primeFactors = innerSolution.getPrimeFactors(4);
        //then
        Assertions.assertThat(primeFactors).hasSize(2).contains(2);
    }

    @Test
    public void codilityTest() throws Exception {
        //given
        int N = 26;
        int[] P = {1,4,16};
        int[] Q = {26,10,20};
        //when
        int[] result = semiPrimes.solution(N, P, Q);
        //then
        Assertions.assertThat(result).hasSize(3).isEqualTo(new int[]{10, 4, 0});
    }

    @Test
    public void simpleTest() throws Exception {
        //given
        int N = 1;
        int[] P = {1};
        int[] Q = {1};
        //when
        int[] result = semiPrimes.solution(N,P,Q);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{0});
    }

    @Test
    public void anotheCodilityTest() throws Exception {
        //given
        int N = 4;
        int[] P = {1};
        int[] Q = {4};
        //when
        int[] result = semiPrimes.solution(N,P,Q);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{1});
    }


}