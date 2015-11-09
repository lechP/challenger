package codility.training.lesson09;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 07.11.2015
 */
public class CountNotDivisibleTest {

    private CountNotDivisible sut = new CountNotDivisible();

    @Test
    public void shouldReturnOnlyMinusOneForOnlyOnes() throws Exception {
        //given
        int[] A = {1, 1, 1, 1, 1, 1, 1};
        //when
        int[] result = sut.mapNextDistincts(A);
        //then
        assertThat(result).isEqualTo(new int[]{0, -1});
    }

    @Test
    public void shouldDetectAllNextDistincts() throws Exception {
        //given
        int[] A = {1, 3, 3, 5, 11, 12, 12};
        //when
        int[] result = sut.mapNextDistincts(A);
        //then
        assertThat(result).isEqualTo(new int[]{0, 3, 3, 5, 5, 11, 11, 11, 11, 11, 11, 12, -1});
    }

    @Test
    public void shouldReturnOnlyDistinctvalues() throws Exception {
        //given
        int[] A = {1, 3, 3, 3, 5, 11, 12, 12};
        //when
        List<Integer> result = sut.getDistinctValues(A);
        //then
        assertThat(result).isEqualTo(Lists.newArrayList(1, 3, 5, 11, 12));
    }

    @Test
    public void testExistenceMapping() {
        //given
        List<Integer> distincts = Arrays.asList(1, 3, 4, 8);
        int max = 8;
        //when
        boolean[] result = sut.mapExistence(distincts, 8);
        //then
        assertThat(result).isEqualTo(new boolean[]{false, true, false, true, true, false, false, false, true});
    }

    @Test
    public void someSolutionTest() throws Exception {
        //given
        int[] A = {1, 1, 3, 6, 12};
        //when
        int[] result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(new int[]{3, 3, 2, 1, 0});
    }

    @Test
    public void codilityTest() throws Exception {
        //given
        int[] A = {3, 1, 2, 3, 6};
        //when
        int[] result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(new int[]{2, 4, 3, 2, 0});
    }

    @Test
    public void codilitySecond() throws Exception {
        //given
        int[] A = {3, 4};
        //when
        int[] result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(new int[]{1, 1});
    }

    @Test
    public void oneElementTest() throws Exception {
        //given
        int[] A = {1};
        //when
        int[] result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(new int[]{0});
    }

    @Test
    public void manyOnesAndOneBiggerValue() throws Exception {
        //given
        int[] A = {1, 1, 1, 20, 1, 1, 1, 1, 1, 1};
        //when
        int[] result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(new int[]{1, 1, 1, 0, 1, 1, 1, 1, 1, 1});
    }


}