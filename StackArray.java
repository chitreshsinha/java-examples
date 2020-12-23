public class StackArray {

	static final int MAX = 1000;
	int top;
	String a[] = new String[MAX];

	StackArray() {
		top = -1;
	}

	public boolean push(String str) {
		if(top > MAX) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = str;
			System.out.println(str + " pushed into stack");
			return true;
		}
	}

	public String peek() {
		return a[top];
	}

	public String pop() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return null;
		} else {
			String val = a[top];
			a[top] = null;
			top--;
			return val;			
		}
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push("chitresh");
		s.push("pooja");
		s.push("himanshu");
		s.push("pankaj");

		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
	}
}