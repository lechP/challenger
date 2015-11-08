package codility.training.lesson10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 08.11.2015
 */
public class CommonPrimeDivisorsTest {

    CommonPrimeDivisors sut = new CommonPrimeDivisors();


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
    public void codilityTestPart1() {
        //given
        int [] A = {15};
        int [] B = {75};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void codilityTestPart2() {
        //given
        int [] A = {10};
        int [] B = {30};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void codilityTestPart3() {
        //given
        int [] A = {3};
        int [] B = {5};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
         public void testWithOneNumberBeingThePowerOfAnother() {
        //given
        int [] A = {125};
        int [] B = {5};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testWithOneNumberBeingBigMultiplicationOfAnother() {
        //given
        int[] A = {250};
        int[] B = {5};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testWithOneNumberBeingBigMultiplicationOfAnother2() {
        //given
        int[] A = {90};
        int[] B = {5};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(0);
    }


    @Test
    public void testWithOnes() {
        //given
        int [] A = {1};
        int [] B = {1};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void codility1to70simulationTest(){

        for(int i=1; i<=70; i++){
            for(int j=1; j<=70; j++){
                int result = sut.solution(new int[]{i},new int[]{j});
                if(result==1){
                    System.out.println(i + " " + j);
                }
            }
        }

    }

}