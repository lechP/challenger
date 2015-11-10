package codility.training.lesson12;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by LPI on 10.11.2015
 */
public class NailingPlanksTest {

    private NailingPlanks sut = new NailingPlanks();

    @Test
    public void codilityTest() throws Exception {
        //given
        int [] A = {1, 4, 5, 8};
        int [] B = {4, 5, 9, 10};
        int [] C = {4, 6, 7, 10, 2};
        //when
        int result = sut.solution(A, B, C);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shouldReturnMinusOneForOnePlankAndOneNailWhichCantNailThePlank() throws Exception {
        //given
        int [] A = {1};
        int [] B = {1};
        int [] C = {2};
        //when
        int result = sut.solution(A, B, C);
        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void shouldReturnMinusOneForManyPlanksInWhichThereIsOneWithoutNail() throws Exception {
        //given
        int [] A = {1, 3, 5, 6, 9, 12, 16};
        int [] B = {3, 4, 6, 8, 12, 17, 19};
        int [] C = {2, 18, 4, 4, 5, 7, 10, 19, 32, 1};
        //when
        int result = sut.solution(A, B, C);
        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void shouldReturnNumberOfNailsWhenTheLastOneIsNeeded() throws Exception {
        //given
        int [] A = {1, 3, 5, 6, 9, 12, 16};
        int [] B = {3, 4, 6, 8, 12, 17, 19};
        int [] C = {2, 18, 4, 4, 5, 7, 10, 19, 32, 14};
        //when
        int result = sut.solution(A, B, C);
        //then
        assertThat(result).isEqualTo(10);
    }

}