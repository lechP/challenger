package codility.training.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LPI on 09.11.2015
 */
public class FibFrog {

    public int solution(int[] A) {
        int N = A.length;
        boolean[] visited = new boolean[N]; //none visited at the beginning

        List<PathStatus> statuses = new ArrayList<>();
        statuses.add(new PathStatus(-1, 0));
        int trialsCounter = 0;
        List<Integer> fibonacciNums = getFibonacciNumbers(N+1);
        while (statuses.size() > trialsCounter) {
            PathStatus status = statuses.get(trialsCounter);
            trialsCounter++;
            for (final Integer fib : fibonacciNums) {
                int positionCandidate = status.position + fib;
                if ((positionCandidate) == N) return status.moves + 1;

                if (positionCandidate < N && A[positionCandidate] == 1 && !visited[positionCandidate]) {
                    statuses.add(new PathStatus(positionCandidate, status.moves + 1));
                    visited[positionCandidate] = true;
                }
            }
        }
        return -1;
    }

    private List<Integer> getFibonacciNumbers(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int preLast = 1;
        int last = 2;
        fibonacciNumbers.add(preLast);
        fibonacciNumbers.add(last);
        int next = last;
        while (next <= limit) {
            next = last + preLast;
            if (next <= limit) {
                preLast = last;
                last = next;
                fibonacciNumbers.add(next);
            }
        }
        return fibonacciNumbers;
    }

    private class PathStatus {
        int position;
        int moves;

        public PathStatus(int position, int moves) {
            this.position = position;
            this.moves = moves;
        }
    }

}
