package codility.training.lesson03;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

/**
 * Created by jsi on 2015-11-04.
 */
public class GenomesTest extends TestCase {

    private Genomes genomes = new Genomes();

    public void testCodility() throws Exception {
        //given
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        //when
        int[] result = genomes.solution(S, P, Q);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{2, 4, 1});
    }

    public void testCodility2() throws Exception {
        //given
        String S = "CAGCCTA";
        int[] P = {5};
        int[] Q = {5};
        //when
        int[] result = genomes.solution(S, P, Q);
        //then
        Assertions.assertThat(result).isEqualTo(new int[]{4});
    }
}