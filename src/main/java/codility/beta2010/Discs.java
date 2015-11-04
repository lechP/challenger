package codility.beta2010;

import java.util.Arrays;

/**
 * Created by jsi on 2015-11-04.
 */
public class Discs {

    private static final int MAGIC_STOP = 10_000_000;

    public int solution(int[] A) {
        Disc[] discs = new Disc[A.length];
        for (int i = 0; i < A.length; i++) {
            discs[i] = new Disc(i, A[i]);
        }
        Arrays.sort(discs, (d1, d2) -> Long.compare(d1.left(), d2.left()));
        int counter = 0;
        for (int i = 0; i < discs.length; i++) {
            counter += countLeftsByBisection(discs, discs[i], i + 1, discs.length);
            if (counter > MAGIC_STOP) {
                return -1;
            }
        }
        return counter;
    }

    private int countLeftsByBisection(Disc[] discs, Disc disc, int start, int end) {
        if (start == end) {
            return 0;
        }
        int pivot = (end + start) / 2;
        if (disc.right() >= discs[pivot].left()) {
            //we have to go right further
            return (pivot - start) + 1 + countLeftsByBisection(discs, disc, pivot + 1, end);
        } else {
            //too far
            return countLeftsByBisection(discs, disc, start, pivot);
        }
    }

    private class Disc {
        private final long left;
        private final long right;

        public Disc(int center, int radius) {
            this.left = (long) center - radius;
            this.right = (long) center + radius;
        }

        public long left() {
            return left;
        }

        public long right() {
            return right;
        }

    }
}
