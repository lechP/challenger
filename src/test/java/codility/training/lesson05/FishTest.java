package codility.training.lesson05;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FishTest {

    private Fish fish = new Fish();

    @Test
    public void codilityTest() {
        //given
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        //when
        int result = fish.solution(A, B);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void oneFishUpstream() {
        //given
        int[] A = {4};
        int[] B = {0};
        //when
        int result = fish.solution(A, B);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void oneFishDownstream() {
        //given
        int[] A = {4};
        int[] B = {1};
        //when
        int result = fish.solution(A, B);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void manyFishUpstream() {
        //given
        int[] A = {4, 3, 10, 111, 2, 5};
        int[] B = {0, 0, 0, 0, 0, 0};
        //when
        int result = fish.solution(A, B);
        //then
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void manyFishDownstream() {
        //given
        int[] A = {4, 3, 10, 111, 2, 5};
        int[] B = {1, 1, 1, 1, 1, 1};
        //when
        int result = fish.solution(A, B);
        //then
        Assertions.assertThat(result).isEqualTo(6);
    }


    @Test
    public void largeNumbers() {
        //given
        int[] A = {4, 3, Integer.MAX_VALUE, 111, 2, 5};
        int[] B = {1, 0, 0, 1, 0, 1};
        //when
        int result = fish.solution(A, B);
        //then
        Assertions.assertThat(result).isEqualTo(3);
    }


}