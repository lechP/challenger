package codility.training.lesson8;

/**
 * Created by jsi on 2015-11-06.
 */
public class Rectangle {

    public int solution(int N){
        int i =2;
        int maxPerimeter = 2*(N+1);
        while(i*i <= N){
            if(N % i == 0){
                maxPerimeter = Math.min(maxPerimeter, 2 * (i + N/i));
            }
            i++;
        }
        return maxPerimeter;
    }
}
