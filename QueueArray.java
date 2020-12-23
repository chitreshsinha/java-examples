import java.util.Arrays;

public class QueueArray {

	int[] array;
	int capacity;
	int front, rear, size;

	QueueArray(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public void add(int num) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			rear = (rear + 1) % capacity;
			array[rear] = num;
			size++;
			System.out.println(num + " is added");
		}
	}

	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			return array[front];
		}
	}

	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			int num = array[front % capacity];
			front++;
			size--;
			System.out.println(num + " is deleted");
			return num;
		}
	}

	public int rear() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			return array[rear];
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void printQueue() {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		QueueArray q = new QueueArray(4);
		q.printQueue();
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
		System.out.println(q.rear());
		System.out.println(q.front());
		q.remove();
		q.add(2);
		q.printQueue();
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
		System.out.println(q.rear());
		System.out.println(q.front());
		q.printQueue();
		q.remove();
		q.printQueue();
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.printQueue();
		q.add(7);
		q.printQueue();
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
		System.out.println(q.rear());
		System.out.println(q.front());
	}
}