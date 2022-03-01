package ss10_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("sau khi xóa phần tử");
        while (!stack.isEmpty()) {
            stack.pop();
        }
        for (int i = 5; i >= 1; i--) {
            stack.push(i);
        }
        System.out.println("sau khi đảo ngược phần tử");
        System.out.println(stack);

        Stack<String> wStack = new Stack<>();
        String mWord = "Hello world";
        String result = "";
        String[] wordArray = mWord.split(" ");
        System.out.println(Arrays.toString(wordArray));
        for (int i = 0; i < wordArray.length; i++) {
            wStack.push(wordArray[i]);
        }
        System.out.println(wStack);
        for (int i = 0; i < wordArray.length; i++) {
            result += wStack.pop()+" ";
        }
        System.out.println(result);



    }
}
