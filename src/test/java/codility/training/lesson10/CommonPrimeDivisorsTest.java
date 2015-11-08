package codility.training.lesson10;

import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 08.11.2015
 */
public class CommonPrimeDivisorsTest {

    CommonPrimeDivisors sut = new CommonPrimeDivisors();

    @Test
    public void shouldPrepareProperArrayOfFirstPrimeFactors() throws Exception {
        //given
        int n = 19;
        //when
        int[] result = sut.prepareFactors(n);
        //then
        int[] firstFactorsFrom0To19 = new int[]{0, 0, 0, 0, 2, 0, 2, 0, 2, 3, 2, 0, 2, 0, 2, 3, 2, 0, 2, 0};
        assertThat(result).isEqualTo(firstFactorsFrom0To19);
    }

    @Test
    public void testGetPrimeFactors() throws Exception {
        //given
        int[] preparedFactors = {0, 0, 0, 0, 2, 0, 2};
        int k = 6;
        //when
        Set<Integer> primeFactors = sut.getDistinctPrimeFactors(k, preparedFactors);
        //then
        assertThat(primeFactors).hasSize(2).contains(2).contains(3);
    }

    @Test
     public void testGetPrimeFactorsCodility() throws Exception {
        //given
        int[] preparedFactors = {0, 0, 0, 0, 2, 0, 2};
        int k = 4;
        //when
        Set<Integer> primeFactors = sut.getDistinctPrimeFactors(k, preparedFactors);
        //then
        assertThat(primeFactors).hasSize(1).contains(2);
    }

    @Test
    public void testGetPrimeFactorsFor1() throws Exception {
        //given
        int[] preparedFactors = {0, 0, 0, 0, 2, 0, 2};
        int k = 1;
        //when
        Set<Integer> primeFactors = sut.getDistinctPrimeFactors(k, preparedFactors);
        //then
        assertThat(primeFactors).isEmpty();
    }

    @Test
    public void gcdForTwoRelativelyPrimeNumbers() {
        //given
        int m = 19;
        int n = 17;
        //when
        int result = sut.gcd(m, n);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void gcdForOneNumberDividingAnother() {
        //given
        int m = 64;
        int n = 8;
        //when
        int result = sut.gcd(m, n);
        //then
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void gcdForNonspecialCase() {
        //given
        int m = 20;
        int n = 8;
        //when
        int result = sut.gcd(m, n);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void findMaxOfTwoArrays() {
        //given
        int [] A = {1, 17, 4, 3, 11, 2};
        int [] B = {7, 10, 15, -3};
        //when
        int result = sut.getMaxValue(A, B);
        //then
        assertThat(result).isEqualTo(17);
    }


}