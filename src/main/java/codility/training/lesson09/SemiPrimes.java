package codility.training.lesson09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LPI on 07.11.2015
 */
public class SemiPrimes {

    public int[] solution(int N, int[] P, int[] Q){
        return new InnerSolution(N, P, Q).invoke();
    }

    protected static class InnerSolution {
        private int n;
        private final int[] p;
        private final int[] q;
        private int[] factors;

        public InnerSolution(int N, int[] p, int[] q) {
            n = N;
            this.p = p;
            this.q = q;
            prepareFactors();
        }

        private void prepareFactors() {
            factors = new int[n+1];
            int i =2;
            while(i * i <= n){
                if(factors[i] == 0){
                    int k = i * i;
                    while(k <= n){
                        if(factors[k] == 0){
                            factors[k] = i;
                        }
                        k+=i;
                    }
                }
                i++;
            }
        }

        public int[] invoke() {
            int[] countSemiprimes = countSemiPrimes(n);
            int [] result = new int[p.length];
            for(int i =0; i<result.length;i++){
                result[i]=countSemiprimes[q[i]] - countSemiprimes[p[i]-1];
            }
            return result;
        }

        private boolean isSemiPrime(int i) {
            return getPrimeFactors(i).size() == 2;
        }

        protected List<Integer> getPrimeFactors(int i) {
            List<Integer> primeFactors = new ArrayList<>((int)Math.log(i) +1);
            while(factors[i] > 0){
                primeFactors.add(factors[i]);
                i/=factors[i];
            }
            primeFactors.add(i);
            return primeFactors;
        }

        private int[] countSemiPrimes(int n) {
            int [] result = new int[n+1];
            result[0] =0;
            for(int i =1; i <= n; i++){
                result[i] = result[i-1];
                if(isSemiPrime(i)){
                    result[i]++;
                }
            }
            return result;
        }
    }
}
