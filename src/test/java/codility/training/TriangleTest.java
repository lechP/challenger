package codility.training;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsi on 2015-11-04.
 */
public class TriangleTest {

    private Triangle triangle = new Triangle();

    @Test
    public void codilityTest() throws Exception {
        //given
        int [] A = {10,2,5,1,8,20};
        //when
        int result = triangle.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(1);

    }

    @Test
    public void codilityTest2() throws Exception {
        //given
        int [] A = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        //when
        int result = triangle.solution(A);
        //then
        Assertions.assertThat(result).isEqualTo(1);

    }
}