package codility.training.lesson14;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 11.11.2015
 */
public class TieRopesTest {

    private TieRopes sut = new TieRopes();

    @Test
    public void codilityTest() {
        //given
        int K = 4;
        int[] A = {1, 2, 3, 4, 1, 1, 3};
        //when
        int result = sut.solution(K, A);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void singleElementLowerThanK() {
        //given
        int K = 4;
        int[] A = {3};
        //when
        int result = sut.solution(K, A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void singleElementEqualToK() {
        //given
        int K = 4;
        int[] A = {4};
        //when
        int result = sut.solution(K, A);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void maxValueOfK() {
        //given
        int K = 1_000_000_000;
        int[] A = {999_999_998, 1, 2, 999_999_999, 999_999_999};
        //when
        int result = sut.solution(K, A);
        //then
        assertThat(result).isEqualTo(2);
    }

}