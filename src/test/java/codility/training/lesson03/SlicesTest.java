package codility.training.lesson03;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by jsi on 2015-11-04.
 */
public class SlicesTest {

    private Slices slices = new Slices();

    @Test
    public void testcodilityTest() throws Exception {
        //given
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        //when
        int result = slices.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testshouldJumpToAnother() throws Exception {
        //given
        int[] A = {4, 2, 2, 5, 1, 1, 8};
        //when
        int result = slices.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void testFailingCodilityTest() throws Exception {
        //given
        int[] A = {-3, -5, -8, -4, -10};
        //when
        int result = slices.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }


}