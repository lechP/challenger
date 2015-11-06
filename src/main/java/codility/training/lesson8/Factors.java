package codility.training.lesson8;

/**
 * Created by jsi on 2015-11-06.
 */
public class Factors {

    public int solution(int N){
        int result = 1;
        int i =2;
        for(;i< N/i;i++){
            if(N % i ==0){
                result+=2;
            }
        }
        if(i == (float)N/i){
            result++;
        }
        return result + (N>1?1:0);
    }
}
