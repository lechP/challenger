package codility.training.lesson11;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 09.11.2015
 */
public class FibonacciPairsTest {

    private FibonacciPairs fibonacciPairs = new FibonacciPairs();

    @Test
    public void shouldFindFirstTvelweNumbers() {
        //given
        int limit = 100;
        //when
        List<Integer> result = fibonacciPairs.getFibonacciNumbers(limit);
        //then
        assertThat(result).isEqualTo(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
    }

    @Test
    public void shouldMarkProperNumbersUpToTheLimit() {
        //given
        int limit = 20;
        //when
        boolean[] result = fibonacciPairs.markFibonacciPairsSums(limit);
        //then
        boolean[] expectedMarks = {true, true, true, true, true, true, true, true, true, true /*0-9*/
                , true, true, false, true, true, true, true, false, true, false, false}; /*10-20*/
        assertThat(result).isEqualTo(expectedMarks);
    }

    @Test
    public void shouldMarkPresentingAllGivenNumbersAsSumOfFibonacciNumbersAsPossible() {
        //given
        int limit = 1000;
        int[] numbers = {89 + 55, 0, 5 + 34, 610 + 21, 987 + 5};
        //when
        boolean[] result = fibonacciPairs.solution(numbers, limit);
        //then
        boolean[] fiveTrues = {true, true, true, true, true};
        assertThat(result).isEqualTo(fiveTrues);
    }

    @Test
    public void shouldMarkPresentingAllGivenNumbersAsSumOfFibonacciNumbersAsImpossible() {
        //given
        int limit = 1000;
        int[] numbers = {89 + 22, 8 + 4, 5 + 33, 610 + 50, 987 + 4};
        //when
        boolean[] result = fibonacciPairs.solution(numbers, limit);
        //then
        boolean[] fiveFalses = {false, false, false, false, false};
        assertThat(result).isEqualTo(fiveFalses);
    }

    @Test
    public void shouldHandleOneMillion() {
        //given
        int limit = 1000_000;
        int[] numbers = {2584 + 4181};
        //when
        boolean[] result = fibonacciPairs.solution(numbers, limit);
        //then
        assertThat(result).isEqualTo(new boolean[] {true});
    }


}