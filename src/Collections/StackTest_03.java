package Collections;
import java.util.Stack;

public class StackTest_03 {
    public static void main(String[] args) {
        Stack <Object> stack = new Stack<Object>();

        stack.push(100);
        stack.push("포도");
        stack.push('A');
        stack.push(true);
        stack.push(-23.33);

        int i = stack.size();
        while(!stack.empty()){
            System.out.printf("stack[%d] = %s\n",i,stack.pop());
            i--;
        }
    }
}
