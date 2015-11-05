package codility.sigma2012;

import java.util.Stack;

/**
 * TODO LPI comment me
 *
 * @author Lech Piechota, Capgemini
 */
public class StoneWall {

    public int solution(int[] H){
        Stack<Integer> stack = new Stack<>();
        int count =0;
        for(int h: H){
            if(stack.isEmpty()){
                stack.push(h);
                count++;
            } else {
                while(!stack.isEmpty() && stack.peek() > h){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < h){
                    stack.push(h);
                    count++;
                }
            }
        }
        return count;
    }

}
