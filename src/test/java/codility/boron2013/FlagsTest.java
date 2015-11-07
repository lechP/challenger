package codility.boron2013;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by LPI on 07.11.2015
 */
public class FlagsTest {

    private Flags flags = new Flags();

    @Test
    public void testMapNearestPeaks() throws Exception {
        //given
        int A[] = {1, 2, 1, 3, 2, 1};
        //when
        int[] result = flags.mapNearestPeaks(A);
        //then
        assertThat(result).isEqualTo(new int[]{1, 1, 3, 3, -1, -1});
    }

    @Test
    public void testGetMaxDistance() throws Exception {
        //given
        int A[] = {1, 2, 3, 4, 5, 4, 7, 8, 9, 10, 9, 12, 13, 14, 15, 16, 13, 18, 19, 20, 21, 15, 23, 20};
        //when
        int result = flags.getMaxDistance(A);
        //then
        assertThat(result).isEqualTo(22 - 4);
    }

    @Test
    public void testCountPossibleFlags() throws Exception {
        //given
        int nearestPeaks[] = {1, 1, 3, 3, 6, 6, 6, -1, -1};
        int currentFlags = 3;
        //when
        int result = flags.countPossibleFlags(nearestPeaks, currentFlags);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void testCountPossibleFlagsAgainstInfiniteLoop() throws Exception {
        //given
        int nearestPeaks[] = {1, 1, 3, 3, 6, 6, 6, -1, -1};
        int currentFlags = 15;
        //when
        int result = flags.countPossibleFlags(nearestPeaks, currentFlags);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testSolution() throws Exception {
        //given
        int A[] = {1, 2, 1, 3, 2, 4, 6, 2, 1};
        //when
        int result = flags.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void codilityTest() throws Exception {
        //given
        int A[] = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        //when
        int result = flags.solution(A);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void singleElem() throws Exception {
        //given
        int A[] = {1};
        //when
        int result = flags.solution(A);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void bigDistance() throws Exception {
        //given
        int A[] = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1};
        //when
        int result = flags.solution(A);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void maaaaanyPeaks() throws Exception {
        //given
        int A[] = new int[100_000];
        for (int i = 1; i < A.length; i = i + 316) {
            A[i] = 1;
        }
        //when
        int result = flags.solution(A);
        //then
        assertThat(result).isEqualTo(316);
    }

    @Test
    public void trickyPeaks() throws Exception {
        //given
        int A[] = {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0};
        //when
        int result = flags.solution(A);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testMapNearestPeaksMaaaaaaaaaaanyPeaks() throws Exception {
        //given
        int A[] = new int[100_000];
        for (int i = 1; i < A.length; i = i + 316) {
            A[i] = 1;
        }
        //when
        int[] result = flags.mapNearestPeaks(A);
        //then
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(1);
        assertThat(result[2]).isEqualTo(1 + 316);
        assertThat(result[99857]).isEqualTo(316 * 316 + 1);
        assertThat(result[99858]).isEqualTo(-1);
    }
}