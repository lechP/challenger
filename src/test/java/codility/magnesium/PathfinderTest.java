package codility.magnesium;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PathfinderTest {

    private Pathfinder sut;

    @Before
    public void setUp() {
        sut = new Pathfinder();
    }

    @Test
    public void shouldReturnZeroForOneElementGraph() {
        //given
        int[] A = {};
        int[] B = {};
        int[] C = {};
        //when
        int result = sut.solution(1, A, B, C);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForTwoElementsGraphWhenThereIsPathBetweenThem() {
        //given
        int[] A = {0};
        int[] B = {1};
        int[] C = {1};
        //when
        int result = sut.solution(2, A, B, C);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForTwoElementsGraphWhenThereIsNoPathBetweenThem() {
        //given (A,B empty -> no paths)
        int[] A = {};
        int[] B = {};
        int[] C = {};
        //when
        int result = sut.solution(2, A, B, C);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroForThreeElementsGraphWhenThereIsNoPathBetweenThem() {
        //given (A,B empty -> no paths)
        int[] A = {};
        int[] B = {};
        int[] C = {};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForThreeElementsGraphWhenThereIsOnlyOnePath() {
        //given
        int[] A = {1};
        int[] B = {2};
        int[] C = {5};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnTwoForThreeElementsGraphWhenThereAreTwoPathsWithDifferentAttractions() {
        //given
        int[] A = {0, 1};
        int[] B = {1, 2};
        int[] C = {3, 4};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturnOneForThreeElementsGraphWhenThereAreTwoPathsWithSameAttractions() {
        //given
        int[] A = {0, 1};
        int[] B = {1, 2};
        int[] C = {3, 3};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneForThreeElementsGraphWhenThereAreThreePathsWithSameAttractions() {
        //given
        int[] A = {0, 1, 2};
        int[] B = {1, 2, 0};
        int[] C = {3, 3, 3};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnTwoForThreeElementsGraphWhenThereAreTwoSameAttractingPathsAndOneWithAnotherAttraction() {
        //given
        int[] A = {0, 1, 2};
        int[] B = {1, 2, 0};
        int[] C = {1, 3, 3};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturnThreeForThreeElementsGraphWhenThereAreThreePathsWithDifferentAttractions() {
        //given
        int[] A = {0, 1, 2};
        int[] B = {1, 2, 0};
        int[] C = {1, 2, 3};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldReturnThreeForThreeElementsGraphWhenThereAreFourPathsWithDifferentAttractionsInSpecificOrder() {
        //given
        int[] A = {0, 1, 2, 0};
        int[] B = {1, 2, 0, 2};
        int[] C = {2, 4, 3, 1};
        //when
        int result = sut.solution(3, A, B, C);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldReturnFourForTheExampleConfiguration() {
        //given
        int[] A = {0, 1, 1, 2, 3, 4, 5, 3};
        int[] B = {1, 2, 3, 3, 4, 5, 0, 2};
        int[] C = {4, 3, 2, 5, 6, 6, 8, 7};
        //when
        int result = sut.solution(6, A, B, C);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shouldReturnThreeWhenFirstAttractionLevelIsDoubled() {
        //given
        int[] A = {0, 1, 2, 4, 3};
        int[] B = {1, 2, 5, 5, 4};
        int[] C = {1, 4, 3, 2, 1};
        //when
        int result = sut.solution(6, A, B, C);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shouldReturnThreeWhenLowerPathIsNotTheLongerOne() {
        //given
        int[] A = {0, 3, 1, 2};
        int[] B = {3, 2, 2, 4};
        int[] C = {4, 3, 1, 2};
        //when
        int result = sut.solution(5, A, B, C);
        //then
        assertThat(result).isEqualTo(3);
    }

}