class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}

public class QueueLinkedList {

	Node head;
	Node tail;
	int size = 0;

	QueueLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void add(int num) {
		System.out.print("add: ");
		Node node = new Node(num);
		if(tail==null) {
			tail = node;
			head = node;
		} else {
			tail.next = node;
			tail = node;
		}
		System.out.println(num + " is added");
		size++;
	}

	public int remove() {
		System.out.print("remove: ");
		if(head==null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			int num = head.data;
			System.out.println(num + " is removed");
			Node temp = head;
			head = head.next;
			temp = null;

			if(head==null) {
				tail = null;
			}

			size--;
			return num;
		}
	}

	public int front() {
		System.out.print("front: ");
		if(head==null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			System.out.println(head.data);
			return head.data;
		}
	}

	public int rear() {
		System.out.print("rear: ");
		if(tail==null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			System.out.println(tail.data);
			return tail.data;
		}
	}

	public int size() {
		System.out.println("size: " + size);
		return size;
	}

	public boolean isEmpty() {
		System.out.println("isEmpty: " + ((tail == null) && (head == null)));
		return (tail == null) && (head == null);
	}

	public void printQueue() {
		System.out.print("printQueue: ");

		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}


	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();
		q.printQueue();
		q.isEmpty();
		q.rear();
		q.front();
		q.remove();
		q.add(2);
		q.printQueue();
		q.isEmpty();
		q.rear();
		q.front();
		q.printQueue();
		q.remove();
		q.printQueue();
		q.isEmpty();
		q.rear();
		q.front();
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.printQueue();
		q.add(7);
		q.printQueue();
		q.isEmpty();
		q.rear();
		q.front();
	}
}