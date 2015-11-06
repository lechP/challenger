package codility.training.lesson8;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PeaksTest {

    private Peaks peaks = new Peaks();

    @Test
    public void shouldAccumulatePeaksFindNoneForOneElemArray() throws Exception {
        //given
        int A[] = {1};
        //when
        int[] result = peaks.accumulatePeaks(A);
        //then
        assertThat(result).isEqualTo(new int[]{0});
    }

    @Test
    public void shouldAccumulatePeaksFindNoneForTwoElemArray() throws Exception {
        //given
        int A[] = {1, 2};
        //when
        int[] result = peaks.accumulatePeaks(A);
        //then
        assertThat(result).isEqualTo(new int[]{0, 0});
    }


    @Test
    public void shouldAccumulatePeaksFindOneInThreeElemArray() throws Exception {
        //given
        int A[] = {1, 2, 1};
        //when
        int[] result = peaks.accumulatePeaks(A);
        //then
        assertThat(result).isEqualTo(new int[]{0, 1, 1});
    }

    @Test
    public void shouldAccumulatePeaksFindNoneInMonotonicArray() throws Exception {
        //given
        int A[] = {1, 2, 2, 5, 7, 14, 14, 14, 15, 17, 18, 19};
        //when
        int[] result = peaks.accumulatePeaks(A);
        //then
        assertThat(result).isEqualTo(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    @Test
    public void shouldAccumulatePeaksFindThree() throws Exception {
        //given
        int A[] = {1, 2, 2, 5, 4, 14, 13, 14, 15, 17, 18, 2};
        //when
        int[] result = peaks.accumulatePeaks(A);
        //then
        assertThat(result).isEqualTo(new int[]{0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3});
    }

    @Test
    public void shouldFindDivisorsFind1() {
        //given
        int N = 1;
        //when
        int[] result = peaks.findRelevantDividors(N);
        //then
        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldFindDivisorsFind1For2() {
        //given
        int N = 2;
        //when
        int[] result = peaks.findRelevantDividors(N);
        //then
        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldFindDivisorsFind1ForBigPrimeNumber() {
        //given
        int N = 97;
        //when
        int[] result = peaks.findRelevantDividors(N);
        //then
        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldFindDivisorsFindAllFor120Except60And120() {
        //given
        int N = 120;
        //when
        int[] result = peaks.findRelevantDividors(N);
        //then
        assertThat(result).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40});
    }

    @Test
    public void shouldFindDivisorsNotCountSquareRootTwice() {
        //given
        int N = 36;
        //when
        int[] result = peaks.findRelevantDividors(N);
        //then
        assertThat(result).isEqualTo(new int[]{1, 2, 3, 4, 6, 9, 12});
    }

    @Test
    public void shouldSolutionReturn0ForOneElemArray() throws Exception {
        //given
        int A[] = {1};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldSolutionReturn0ForTwoElemArray() throws Exception {
        //given
        int A[] = {1, 2};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldSolutionReturn1ForThreeElemArrayWithPeak() throws Exception {
        //given
        int A[] = {1, 2, 1};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldSolutionReturn2ForSixElemArrayWithTwoPeaks() throws Exception {
        //given
        int A[] = {1, 2, 1, 3, 2, 1};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void codilityTest() throws Exception {
        //given
        int A[] = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldSolutionReturn0For24elemArrayWithoutPeek() throws Exception {
        //given
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldSolutionReturn4For24elemArrayWithFivePeeks() throws Exception {
        //given
        int A[] = {1, 2, 3, 4, 5, 4, 7, 8, 9, 10, 9, 12, 13, 14, 15, 16, 13, 18, 19, 20, 21, 15, 23, 20};
        //when
        int result = peaks.solution(A);
        //then
        assertThat(result).isEqualTo(4);
    }


}