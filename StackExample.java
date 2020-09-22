import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		System.out.println(stack.peek());

		System.out.println(stack);
	}
}