package codility.training.lesson11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsi on 2015-11-08.
 */
public class FrogTest {

    private Frog frog = new Frog();

    @Test
    public void codilityTest() throws Exception {
        //given
        int[] A = {0,0,0,1,1,0,1,0,0,0,0};
        //when
        int result = frog.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void anotherCodilityTest() throws Exception {
        //given
        int[] A = {0,0,0};
        //when
        int result = frog.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(-1);
    }
}