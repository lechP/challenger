package codility.training.lesson06;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DominatorTest {

    private Dominator dominator = new Dominator();

    @Test
    public void codilityTest() {
        //given
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        //when
        int result = dominator.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void exactHalfOfValuesTheSame() {
        //given
        int[] A = {3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4};
        //when
        int result = dominator.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void emptyArray() {
        //given
        int[] A = {};
        //when
        int result = dominator.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void singleElement() {
        //given
        int[] A = {3};
        //when
        int result = dominator.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void oneMoreThanHalf() {
        //given
        int[] A = {7, 5, 3, 3, 4, 3, 1, 3, 3};
        //when
        int result = dominator.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void onlyLargeNumbers() {
        //given
        int[] A = {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        //when
        int result = dominator.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

}