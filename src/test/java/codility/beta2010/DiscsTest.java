package codility.beta2010;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by jsi on 2015-11-04.
 */
public class DiscsTest {

    private Discs discs = new Discs();

    @Test
    public void codilityTest() throws Exception {
        //given
        int[] A = {1, 5, 2, 1, 4, 0};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(11);
    }

    @Test
    public void codilityTest2() throws Exception {
        //given
        int[] A = {1, 2147483647, 0};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(2);

    }

    @Test
    public void someRandomTest() throws Exception {
        //given
        int[] A = {2, 0, 1, 6, 4, 1};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(12);
    }

    @Test
    public void onlyZeroRadiuses() throws Exception {
        //given
        int[] A = {0, 0, 0, 0, 0, 0, 0};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void emptyArrayOfDiscs() throws Exception {
        //given
        int[] A = {};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void singleDisc() throws Exception {
        //given
        int[] A = {2135323421};
        //when
        int result = discs.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

}