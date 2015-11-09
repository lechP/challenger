package codility.training.lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LPI on 07.11.2015
 * TODO clean this unholy mess
 */
public class CountNotDivisible {

    public int[] solution(int[] A) {

        int[] sortedA = copyAndSort(A);
        int[] nextDistincts = mapNextDistincts(sortedA);
        List<Integer> distinctValues = getDistinctValues(sortedA);
        boolean[] exist = mapExistence(distinctValues, sortedA[sortedA.length - 1]);

        int[] dividors = new int[sortedA[sortedA.length - 1] + 1];

        for (int a : sortedA) {
            dividors[a]++;
            int nextDistinct = nextDistincts[a];
            int k = a;
            while (nextDistinct > -1) {
                k = k + a * Math.max(1, (nextDistinct - k) / a);
                if (k <= sortedA[sortedA.length - 1]) {

                    if (exist[k]) {
                        dividors[k]++;
                    }
                    nextDistinct = nextDistincts[k]; //out of bounds!!
                } else {
                    nextDistinct = -1;
                }
            }
        }

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A.length - dividors[A[i]];
        }

        return result;
    }

    protected boolean[] mapExistence(List<Integer> distinctValues, int max) {
        boolean[] exist = new boolean[max + 1];
        for (final Integer distinctValue : distinctValues) {
            exist[distinctValue] = true;
        }
        return exist;
    }

    protected List<Integer> getDistinctValues(int[] sortedA) {
        List<Integer> distinctValues = new ArrayList<>();
        int last = sortedA[0];
        distinctValues.add(last);
        for (int i = 1; i < sortedA.length; i++) {
            if (sortedA[i] > last) {
                last = sortedA[i];
                distinctValues.add(last);
            }
        }
        return distinctValues;
    }

    private int[] copyAndSort(int[] A) {
        int[] result = Arrays.copyOf(A, A.length);
        Arrays.sort(result);
        return result;
    }

    protected int[] mapNextDistincts(int[] A) {
        int N = A.length;
        int next = A[N - 1];
        int[] result = new int[next + 1];
        result[next] = -1;
        int i = N - 2;
        while (i >= 0) {
            int k = A[i];
            for (int j = k; j < next; j++) {
                result[j] = next;
            }
            next = k;
            i--;
        }

        return result;
    }
}
