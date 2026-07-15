import java.util.*;

public class NextBusierDay {
    public static int[] nextBusierDay(int[] visitors){
        int[] ans=new int[visitors.length];
        Arrays.fill(ans,-1);
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<visitors.length;i++){
            while(!stack.isEmpty()&&visitors[i]>visitors[stack.peek()]){
                ans[stack.pop()]=visitors[i];
            }
            stack.push(i);
        }
        return ans;
    }
}