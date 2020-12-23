class Node {
	String val;
	Node next;
	Node(String val) {
		this.val = val;
	}
}

public class StackLinkedList {

	Node root;

	StackLinkedList() {
		root=null;
	}

	public void push(String str) {
		Node newNode = new Node(str);

		if(root==null) {
			root = newNode;
		} else {
			Node temp = root;
			newNode.next = temp;
			root = newNode;
		}
		System.out.println("Added " + str + " to stack");
	}

	public String peek() {
		if(root==null) {
			System.out.println("Stack is Empty"); 
			return null;
		} else {
			return root.val;
		}
	}

	public String pop() {
		if(root==null) {
			System.out.println("Stack is Empty"); 
			return null;
		}
		String result = root.val;
		Node temp = root;
		root = root.next;
		temp = null;
		return result;
	}

	public boolean isEmpty() {
		return root==null;
	}

	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		System.out.println("Is stack empty? " + s.isEmpty());
		System.out.println("Peek " + s.peek());
		System.out.println("Pop " + s.pop());

		s.push("chitresh");
		s.push("pooja");
		s.push("chunnu");
		System.out.println("Is stack empty? " + s.isEmpty());
		System.out.println("Peek " + s.peek());
		System.out.println("Pop " + s.pop());
		System.out.println("Peek " + s.peek());
	}
}