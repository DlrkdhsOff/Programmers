package Stack_Queue;

import java.util.*;

public class SQ1 {
    public Stack<Integer> solution(int []arr) {
        int num = 0;
        Stack<Integer> stack = new Stack();
        for (int data : arr) {
            if (stack.isEmpty()) {
                stack.push(data);
            }else{
                if (stack.peek() != data) {
                    stack.push(data);
                }
            }
        }

        return stack;
    }
}
