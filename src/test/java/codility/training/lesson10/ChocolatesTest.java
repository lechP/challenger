package codility.training.lesson10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsi on 2015-11-07.
 */
public class ChocolatesTest {

    private Chocolates chocolates = new Chocolates();

    @Test
    public void codilityTest() throws Exception {
        //given
        int N = 10;
        int M = 4;
        //when
        int result = chocolates.solution(N, M);
        //then
        Assertions.assertThat(result).isEqualTo(5);
    }
}