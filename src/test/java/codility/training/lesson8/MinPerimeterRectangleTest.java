package codility.training.lesson8;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 06.11.2015
 */
public class MinPerimeterRectangleTest {

    MinPerimeterRectangle sut = new MinPerimeterRectangle();

    @Test
    public void testFor1() throws Exception {
        //given
        int N = 1;
        //when
        int result = sut.solution(N);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void testForModeratePrimeNumber() throws Exception {
        //given
        int N = 31;
        //when
        int result = sut.solution(N);
        //then
        assertThat(result).isEqualTo(64);
    }

    @Test
    public void testForSquareNumber() throws Exception {
        //given
        int N = 64;
        //when
        int result = sut.solution(N);
        //then
        assertThat(result).isEqualTo(32);
    }

    @Test
    public void testForMaximalNumber() throws Exception {
        //given
        int N = 1000000000;
        //when
        int result = sut.solution(N);
        //then
        assertThat(result).isEqualTo(126500);
    }
}