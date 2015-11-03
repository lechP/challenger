package codility.training;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * TODO LPI comment me
 *
 * @author Lech Piechota, Capgemini
 */
public class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void codilityTest() throws Exception {
        //given
        int N = 5;
        int[] A = new int[]{3,4,4,6,1,4,4};
        //when
        int[] result = maxCounters.solution(N,A);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{3,2,2,4,2});
    }

    @Test
    public void allGlobalIncreases() throws Exception {
        //given
        int N = 5;
        int[] A = new int[]{6,6,6,6,6};
        //when
        int[] result = maxCounters.solution(N,A);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{0,0,0,0,0});
    }

    @Test
    public void allLocalIncreases() throws Exception {
        //given
        int N = 5;
        int[] A = new int[]{1,2,3,4,5};
        //when
        int[] result = maxCounters.solution(N,A);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{1,1,1,1,1});
    }

}