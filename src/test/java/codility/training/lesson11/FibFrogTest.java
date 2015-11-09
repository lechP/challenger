package codility.training.lesson11;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 09.11.2015
 */
public class FibFrogTest {

    private FibFrog fibFrog = new FibFrog();

    @Test
    public void shouldReturnAllPossibleJumpPositionsForTheBankPosition() {
        //given
        int bankPosition = -1;
        int[] leaves = {1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1};
        //when
        List<Integer> result = fibFrog.getPossibleJumpPositions(leaves, bankPosition);
        //then
        assertThat(result).isEqualTo(Arrays.asList(12, 7, 4, 0));
    }

    @Test
    public void shouldReturnAllPossibleJumpPositionsForThePositionInTheMiddleOfTheRiver() {
        //given
        int currPosition = 4;
        int[] leaves = {1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        //when
        List<Integer> result = fibFrog.getPossibleJumpPositions(leaves, currPosition);
        //then
        assertThat(result).isEqualTo(Arrays.asList(12, 9, 7));
    }

    @Test
    public void shouldReturnEmptyListForOnlyZerosAndNnotBeingFib() {
        //given
        int bankPosition = -1;
        int[] leaves = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //when
        List<Integer> result = fibFrog.getPossibleJumpPositions(leaves, bankPosition);
        //then
        assertThat(result).isEqualTo(new LinkedList<>());
    }

    @Test
    public void shouldReturnNforOnlyZerosAndNbeingFib() {
        //given
        int bankPosition = -1;
        int[] leaves = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //when
        List<Integer> result = fibFrog.getPossibleJumpPositions(leaves, bankPosition);
        //then
        assertThat(result).isEqualTo(Collections.singletonList(12));
    }

    @Test
    public void shouldReturnOneWhenFrogCanImmediatelyJumpToTheEnd() {
        //given
        int[] leaves = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        //when
        int result = fibFrog.solution(leaves);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnTwoWhenFrogCanJumpToTheEndWithTwoJumps() {
        //given
        int[] leaves = {0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
        //when
        int result = fibFrog.solution(leaves);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturnThreeWhenFirstLongestJumpIsDeadEnd() {
        //given
        int[] leaves = {0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                //N=18; correct jumps = 3+3+13; dead end jump = 8
        //when
        int result = fibFrog.solution(leaves);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldReturnMinusOneWhenThereIsNoPossibleWay() {
        //given
        int[] leaves = {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //N=18; only possible jump = -8; and then nothing
        //when
        int result = fibFrog.solution(leaves);
        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void shouldReturnMinusOneOnZerosOnly() {
        //given
        int[] leaves = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //N=18; only possible jump = -8; and then nothing
        //when
        int result = fibFrog.solution(leaves);
        //then
        assertThat(result).isEqualTo(-1);
    }

}