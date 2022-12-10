package DataStructures;

public class DoublyLinkedList <T> implements Iterable <T> {
	// Instance variables
	private int size = 0;
	private Node <T> head = null;
	private Node <T> tail = null;

	// Internal Class: Node to represent data
	private class Node <T> {
		T data;
		Node <T> prev, next;

		// Q: What happens when i create a Node object without calling constructor.

		// Constructor for Node class
		public Node(T data, Node <T> prev, Node <T> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		@Override public String toString() {
			return data.toString();
		}
	}

	private void emptyError() {
		if (isEmpty())
			throw new RuntimeException("Empty list");
	}

	public void clear() {
		Node <T> trav = head;

		while (trav != null) {
			Node <T> next = trav.next;
			trav.prev = trav.next = null;
			trav.data = null;
			trav = next;
		}

		head = tail = null;
		size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void addFirst(T elem) {
		if (isEmpty()) {
			head = tail = new Node <T> (elem, null, null);
		} else {
			head.prev = new Node <T> (elem, null, head);
			head = head.prev;
		}

		size++;
	}

	public void addLast(T elem) {
		if (isEmpty()) {
			head = tail = new Node <T> (elem, null, null);
		} else {
			tail.next = new Node <T> (elem, tail, null);
			tail = tail.next;
		}

		size++;
	}

	public void add(T elem) {
		addLast(elem);
	}

	// Check the value of the first node if it exists, O(1)
	public T peekFirst() {
		emptyError();
		return head.data;
	}

	public T peekLast() {
		emptyError();
		return tail.data;
	}

	public T removeFirst() {
		emptyError();

		T data = head.data;
		head = head.next;
		--size;

		if (isEmpty())		// This is b/c if head moves on and it was the only node it means now
			tail = null;	// head points to null so we got to make tail point to null as well.
		else 					// if not empty doe since we moved head to next node
			head.prev = null;	// we got to make this new head prev pointer be 

		return data;
	}

	public T removeLast() {
		emptyError();

		T data = tail.data;
		tail = tail.prev;
		--size;

		if (isEmpty())
			head = null;
		else 
			tail.next = null;

		return data;
	}

	private T remove(Node <T> node) {
		if (node.prev == null)
			removeFirst();
		if (node.next == null)
			removeLast();

		node.prev.next = node.next;
		node.next.prev = node.prev;

		T data = node.data;

		node.data = null;
		node = node.prev = node.next = null;

		--size;

		return data;
	}

	public T removeAt(int index) {

		if (index < 0 || index >= size)
			throw new IllegalArgumentException();

		int i = 0;
		Node <T> trav;

		if (i < size/2) {
			for (i = 0, trav = head; i != index; i++)
				trav = trav.next;
		} else {
			for (i = size - 1, trav = tail; i != index; i--)
				trav = trav.prev;
		}

		return remove(trav);
	}

	public boolean remove(Object obj) {
		Node <T> trav;

		if (obj == null) {
			for(trav = head; trav != null; trav = trav.next) {
				if (trav.data == null) {
					remove(trav);
					return true;
				}
			}
		} else {
			for(trav = head; trav != null; trav = trav.next) {
				if (obj.equals(trav.data)) {
					remove(trav);
					return true;
				}
			}
		}

		return false;
	}

	public int indexOf(Object obj) {
		int index = 0;
		Node <T> trav;

		if (obj == null) {
			for (trav = head; trav != null; trav = trav.next, index++)
				if (trav.data == null)
					return index;
		} else {
			for (trav = head; trav != null; trav = trav.next, index++)
				if(obj.equals(trav.data))
					return index;
		}

		return -1;
	}

	public boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}

	@Override public java.util.Iterator <T> iterator() {
		return new java.util.Iterator <T> () {
			private Node <T> trav = head;

			@Override public boolean hasNext() {
				return trav != null;
			}

			@Override public T next() {
				T data = trav.data;
				trav = trav.next;
				return data;
			}
		};
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("[");

		Node <T> trav;

		for(trav = head; trav != null; trav = trav.next)
			sb.append(trav.data + ", ");

		sb.append(" ]");

		return sb.toString();
	}
}