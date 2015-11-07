package codility.training.lesson11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsi on 2015-11-07.
 */
public class LadderTest {

    private Ladder ladder = new Ladder();
    @Test
    public void codilityTest() throws Exception {
        //given
        int []A = {4,4,5,5,1};
        int []B = {3,2,4,3,1};
        //when
        int[] result = ladder.solution(A,B);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{5,1,8,0,1});
    }
}