package codility.training;

/**
 * Created by jsi on 2015-11-04.
 */
public class Nesting {

    public int solution(String S){
        int counter = 0;
        for(int i =0; i<S.length();i++){
            if(S.charAt(i) == ')'){
                if(counter ==0){
                    return 0;
                }
                counter--;
            }else {
                counter++;
            }
        }
        return counter == 0?1:0;
    }

}
