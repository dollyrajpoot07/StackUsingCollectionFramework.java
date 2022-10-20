import java.util.*;

public class StackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        while(!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
