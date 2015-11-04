package codility.training;

/**
 * Created by jsi on 2015-11-04.
 */
public class Genomes {

    public int[] solution(String S, int[] P, int[] Q){
        int[] as = new int[S.length()+1];
        int[] cs = new int[S.length()+1];
        int[] gs = new int[S.length()+1];
        int[] ts = new int[S.length()+1];
        char x = S.charAt(0);
        if(x == 'A'){
            as[0]=1;
        } else if(x == 'C'){
            cs[0]=1;
        }else if(x == 'G'){
            gs[0]=1;
        }else if(x == 'T'){
            ts[0]=1;
        }
        for(int i =1;i<S.length();i++){
            x = S.charAt(i);
            if(x == 'A'){
                as[i]=as[i-1]+1;
                cs[i]=cs[i-1];
                gs[i]=gs[i-1];
                ts[i]=ts[i-1];
            } else if(x == 'C'){
                cs[i]=cs[i-1]+1;
                as[i]=as[i-1];
                gs[i]=gs[i-1];
                ts[i]=ts[i-1];
            }else if(x == 'G'){
                gs[i]=gs[i-1]+1;
                cs[i]=cs[i-1];
                as[i]=as[i-1];
                ts[i]=ts[i-1];
            }else if(x == 'T'){
                ts[i]=ts[i-1]+1;
                cs[i]=cs[i-1];
                gs[i]=gs[i-1];
                as[i]=as[i-1];
            }
        }
        int[] result = new int[P.length];
        for(int i = 0; i<P.length;i++){
            if(P[i]==0){
                if (as[Q[i]]> 0) {
                    result[i] = 1;
                } else if (cs[Q[i]] > 0) {
                    result[i] = 2;
                } else if (gs[Q[i]] > 0) {
                    result[i] = 3;
                } else if (ts[Q[i]]  > 0) {
                    result[i] = 4;
                }
            } else {
                if (as[Q[i]] - as[P[i] - 1] > 0) {
                    result[i] = 1;
                } else if (cs[Q[i]] - cs[P[i] - 1] > 0) {
                    result[i] = 2;
                } else if (gs[Q[i]] - gs[P[i] - 1] > 0) {
                    result[i] = 3;
                } else if (ts[Q[i]] - ts[P[i] - 1] > 0) {
                    result[i] = 4;
                }
            }
        }
        return result;
    }
}
