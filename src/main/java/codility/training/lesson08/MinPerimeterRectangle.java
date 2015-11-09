package codility.training.lesson08;

/**
 * Created by LPI on 06.11.2015
 */
public class MinPerimeterRectangle {


    int solution(int N){
        int i=1;
        int sideA = 1;
        int sideB = N;
        while(i*i<=N){
            if(N%i==0){
                sideA = i;
                sideB = N/i;
            }
            i++;
        }

        return 2*(sideA + sideB);
    }

}
