package codility.training;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class EquiLeaderTest {

    private EquiLeader sut = new EquiLeader();

    @Test
    public void codilityTest() {
        //given
        int[] A = {4, 3, 4, 4, 4, 2};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void emptyArray() {
        //given
        int[] A = {};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void noLeader() {
        //given
        int[] A = {1,2,3,4,5,6};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void allValuesTheSame() {
        //given
        int[] A = {3,3,3,3,3};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(4); //one slice less than number of elements
    }

    @Test
    public void someRandomTestWithLeaderAndNoEquiLeaders() {
        //given
        int[] A = {3,3,1,100,3,3,3,99,15};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void someRandomTestWithLeaderAndSixEquiLeaders() {
        //given
        int[] A = {3,3,1,100,3,3,3,99,3};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void bigNumbers() {
        //given
        int[] A = {Integer.MAX_VALUE,Integer.MAX_VALUE,1,100,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,99,Integer.MAX_VALUE};
        //when
        int result = sut.solution(A);
        //then
        assertThat(result).isEqualTo(6);
    }

}