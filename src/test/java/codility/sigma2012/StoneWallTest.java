package codility.sigma2012;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * TODO LPI comment me
 *
 * @author Lech Piechota, Capgemini
 */
public class StoneWallTest {

    private StoneWall stoneWall = new StoneWall();

    @Test
    public void testSolution() throws Exception {
        //given
        int [] H ={ 8,8,5,7,9,8,7,4,8};
        //when
        int result = stoneWall.solution(H);

        //then
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void testSolution2() throws Exception {
        //given
        int [] H ={ 3,5,2,3,2,6,4,6,5,4};
        //when
        int result = stoneWall.solution(H);

        //then
        Assertions.assertThat(result).isEqualTo(8);
    }


    @Test
    public void allEquals() throws Exception {
        //given
        int [] H ={ 1,1,1,1,1,1,1};
        //when
        int result = stoneWall.solution(H);

        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void singleElement() throws Exception {
        //given
        int [] H ={ 3};
        //when
        int result = stoneWall.solution(H);

        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void bigNumbers() throws Exception {
        //given
        int [] H ={  3,5,2,3,2,Integer.MAX_VALUE,4,Integer.MAX_VALUE,5,4};
        //when
        int result = stoneWall.solution(H);

        //then
        Assertions.assertThat(result).isEqualTo(8);
    }
}