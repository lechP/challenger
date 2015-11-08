package codility.training.lesson10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 08.11.2015
 */
public class CommonPrimeDivisorsTest {

    CommonPrimeDivisors sut = new CommonPrimeDivisors();


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
    public void testWithDataFailingPreviouslyOnCodility() {
        //given
        int [] A = {6, 6, 6, 10, 12, 14, 18, 18, 24, 40, 48};
        int [] B = {24, 48, 54, 40, 54, 56, 24, 48, 54, 50, 54};
        //when
        int result = sut.solution(A, B);
        //then
        assertThat(result).isEqualTo(11);
    }

}