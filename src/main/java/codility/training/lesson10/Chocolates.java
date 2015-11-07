package codility.training.lesson10;

/**
 * Created by jsi on 2015-11-07.
 */
public class Chocolates {

    public int solution(int N, int M){
        return N / gcd(Math.max(N,M), Math.min(N,M));
    }

    private int gcd(int a, int b) {
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
}
