package Basic.DataStructures;

import java.util.LinkedList;
import java.util.Iterator;

public class Queue <T> implements Iterable <T> {

	private LinkedList <T> list = new LinkedList <T> ();

	public Queue() { }

	public Queue(T firstElem) {
		offer(firstElem);
	}

	// Return the size of the queue
	public int size() {
		return list.size();
	}

	// Returns wheather or not the queue is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	private void emptyError() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");
	}

	// Peek the element at the fornt of the queue
	// Method throws error if the queue is empty
	public T peek() {
		emptyError();
		return list.peekFirst();
	}

	// remove an element from the front of the queue
	// Method throws error if the queue is empty
	public T poll() {
		emptyError();
		return list.removeFirst();
	}

	// Add an element to the back of the queue
	public void offer(T elem) {
		list.addLast(elem);
	}

	@Override public Iterator <T> iterator () {
		return list.iterator();
	}
}