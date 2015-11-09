package codility.training.lesson03;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GenomicRangeQueryTest {

    private GenomicRangeQuery sut = new GenomicRangeQuery();

    @Test
    public void shouldWorkWithOneCharString() {
        //given
        String genome = "T";
        int[] P = new int[]{0};
        int[] Q = new int[]{0};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{4});
    }

    @Test
    public void shouldDetectOneAsMinimalFactor() {
        //given
        String genome = "GTACCGT";
        int[] P = new int[]{1};
        int[] Q = new int[]{4};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldNotThrowErrorOnPequalToZero() {
        //given
        String genome = "GTACCGT";
        int[] P = new int[]{0};
        int[] Q = new int[]{4};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldReturnOneWhenOnlyFirstElementIsA() {
        //given
        String genome = "ATGCCGT";
        int[] P = new int[]{0};
        int[] Q = new int[]{4};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldDetectTwoAndThreeAsMinimalFactor() {
        //given
        String genome = "GTACCGTAATGTTGGTACCATG";
        int[] P = new int[]{4, 9};
        int[] Q = new int[]{6, 15};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{2, 3});
    }

    @Test
    public void shouldDetectFourForStringWithOnlyT() {
        //given
        String genome = "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
        int[] P = new int[]{4, 9, 0};
        int[] Q = new int[]{6, 15, genome.length() - 1};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{4, 4, 4});
    }

    @Test
    public void shouldFindCorrectSolutionForCourseraTestCase() {
        //given
        String genome = "CAGCCTA";
        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6};
        //when
        int[] result = sut.solution(genome, P, Q);
        //then
        assertThat(result).isEqualTo(new int[]{2, 4, 1});
    }

}