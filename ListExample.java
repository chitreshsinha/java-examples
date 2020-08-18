import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

// http://tutorials.jenkov.com/java-collections/list.html
public class ListExample {
	public static void examples() {
		List<String> l1 = new ArrayList<String>();
		l1.add("abc");
		l1.add("bcd");
		l1.add("cde");
		System.out.println(l1);

		l1.remove(1);
		System.out.println(l1);

		l1.add(1, "bcd");
		System.out.println(l1);

		System.out.println(l1.get(1));

		l1.set(1, "xyz");
		System.out.println(l1);

		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(123);
		l2.add(234);
		l2.add(345);
		System.out.println(l2);

		l2.remove(1);
		System.out.println(l2);

		l2.add(1, 100);
		System.out.println(l2);

		System.out.println(l2.get(1));

		l2.set(1, 234);
		System.out.println(l2);

		l2.clear();
		System.out.println(l2);		
	}

	public static void main(String args[]) {
		// ListExample le = new ListExample();
		ListExample.examples();
	}
}