class Node {
	int val;
	Node next;
	Node(int val) {
		this.val = val;
	}
}	

public class LinkedList {
	Node head;
	int size;

	LinkedList() {
		head = null;
		size = 0;
	}

	public void insertAtEnd(int num) {
		Node node = new Node(num);
		if(head==null) {
			head = node;
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}

	public void insertAtHead(int num) {
		Node node = new Node(num);
		if(head==null) {
			head = node;
		} else {
			Node temp = head;
			node.next = head;
			head = temp;
		}
		size++;
	}

	public void insertAtPos(int pos, int num) {
		Node node = new Node(num);
		if(pos == 0) {
			insertAtHead(num);
		} else if (pos < size) {
			Node temp = head;
			while(pos-1 > 0) {
				temp = temp.next;
				pos--;
			}
			Node next = temp.next;
			temp.next = node;
			node.next = next;
			size++;
		} else if (pos == size) {
			insertAtEnd(num);
		} else {
			System.out.println("Invalid position to insert");
		}
	}

	public void delete(int num) {
		Node temp = head;
		Node prev = null;

		if(temp==null) {
			System.out.println("Head is null");
			return;
		}

		if(temp.val == num) {
			head = temp.next;
			temp = null;
			size--;
			return;
		} 

		while(temp!=null) {
			if(temp.val == num) {
				break;
			}
			prev = temp;
			temp = temp.next;
		}

		if(temp.val==num) {
			Node next = temp.next;
			prev.next = next;
			temp = null;
			size--;
		} else {
			System.out.println(num + " not found to be deleted");
		}
	}

	public void deletePos(int pos) {
		if(pos == 0) {
			deleteAtHead();
		} else if (pos < size) {
			Node temp = head;
			while(pos-1 > 0) {
				temp = temp.next;
				pos--;
			}
			Node deleteNode = temp.next;
			Node next = deleteNode.next;
			temp.next = next;
			deleteNode = null;
			size--;
		} else if (pos == size) {
			deleteAtEnd();
		} else {
			System.out.println("Invalid position to delete");
		}
	}

	public void deleteAtHead() {
		if(head==null) {
			System.out.println("No head to delete");
		} else {
			Node temp = head;
			head = temp.next;
			temp = null;
			size--;
		}
	}

	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("No node to delete");
		} else {
			Node temp = head;
			Node prev = null;
			while(temp.next!=null) {
				prev = temp;
				temp = temp.next;
			}
			if(prev!=null) {
				prev.next = null;
			} 
			temp = null;
			size--;
		}
	}

	public int search(int num) {
		Node temp = head;
		int pos = -1;
		int count = 0;
		while(temp!=null) {
			if(temp.val==num) {
				pos = count;
				break;
			}
			temp = temp.next;
			count++;
		}
		return pos;
	}

	public boolean isEmpty() {
		if(size==0 && head==null) {
			return true;
		} 
		return false;
	}

	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.printList();
		System.out.println(names.isEmpty());
		System.out.println(names.search(3));
		names.delete(2);
		names.deletePos(0);
		names.deletePos(1);
		names.deleteAtHead();
		names.deleteAtEnd();
		names.insertAtEnd(1);
		names.printList();
		System.out.println(names.isEmpty());
		System.out.println(names.search(1));
		System.out.println(names.search(3));
	}
}