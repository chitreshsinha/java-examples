import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		System.out.println("isEmpty: " + queue.isEmpty());
		System.out.println("size: " + queue.size());

		queue.add("chitresh");
		queue.add("pooja");
		queue.add("pankaj");

		System.out.println("peek: " + queue.peek());

		queue.add("mahesh");
		queue.add("meena");
		queue.add("triveni");
		queue.add("himanshu");
		System.out.println(new ArrayList<>(queue));

		System.out.println("size: " + queue.size());
		System.out.println("contains: " + queue.contains("bunty"));

		queue.remove();

		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("size: " + queue.size());
		System.out.println("contains: " + queue.contains("chitresh"));
		System.out.println("peek: " + queue.peek());
		System.out.println("isEmpty: " + queue.isEmpty());

		queue.clear();
		System.out.println("size: " + queue.size());
		System.out.println("contains: " + queue.contains("chitresh"));
		System.out.println("isEmpty: " + queue.isEmpty());
	}
}