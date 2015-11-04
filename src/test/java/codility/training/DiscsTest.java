package codility.training;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsi on 2015-11-04.
 */
public class DiscsTest {

    private Discs discs = new Discs();

    @Test
    public void codilityTest() throws Exception {
        //given
        int[] A = {1,5,2,1,4,0};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(11);

    }

    @Test
    public void codilityTest2() throws Exception {
        //given
        int[] A = {1,2147483647,0};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(2);

    }
}