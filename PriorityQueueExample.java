import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Iterator;

class PriorityQueueComparatator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<String> maxHeap = new PriorityQueue<>(new PriorityQueueComparatator());

		System.out.println("isEmpty: " + maxHeap.isEmpty());
		System.out.println("size: " + maxHeap.size());

		maxHeap.add("chitresh");
		maxHeap.add("pooja");
		maxHeap.add("pankaj");

		System.out.println("peek: " + maxHeap.peek());

		maxHeap.add("mahesh");
		maxHeap.add("meena");
		maxHeap.add("triveni");
		maxHeap.add("himanshu");
		System.out.println("peek: " + maxHeap.peek());
		System.out.println(new ArrayList<>(maxHeap));

		System.out.println("size: " + maxHeap.size());
		System.out.println("contains: " + maxHeap.contains("bunty"));

		maxHeap.remove();

		Iterator it = maxHeap.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("size: " + maxHeap.size());
		System.out.println("contains: " + maxHeap.contains("chitresh"));
		System.out.println("peek: " + maxHeap.peek());
		System.out.println("isEmpty: " + maxHeap.isEmpty());

		maxHeap.clear();
		System.out.println("size: " + maxHeap.size());
		System.out.println("contains: " + maxHeap.contains("chitresh"));
		System.out.println("isEmpty: " + maxHeap.isEmpty());	}
}