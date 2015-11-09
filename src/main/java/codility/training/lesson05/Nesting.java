package codility.training.lesson05;

/** created by LPI and JSI paralelly ;-) */
public class Nesting {

    public int solution(String S){
        int stack = 0;
        for (int i = 0; i < S.length(); i++) {
             if(S.charAt(i)=='('){
                 stack++;
             }else if(S.charAt(i)==')'){
                 stack--;
                 if(stack<0){
                     return 0;
                 }
             }else{
                 throw new IllegalArgumentException();
             }
        }

        return stack == 0 ? 1 : 0;
    }

}
