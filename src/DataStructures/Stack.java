package DataStructures;

public class Stack <T> implements Iterable <T> {
	private java.util.LinkedList <T> list = new java.util.LinkedList <T> ();

	// Empty Stack constructor
	public Stack () {

	}

	// Stack with an initial element 
	public Stack (T firstElem) {
		push(firstElem);
	}

	// Return number of elements in stack
	public int size() {
		return list.size();

	}

	// Check if stack is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	// Push an element onto stack
	public void push(T elem) {
		list.addLast(elem);
	}

	private void emptyError() {
		if (isEmpty())
			throw new java.util.EmptyStackException();
	}

	// Pop an element off stack --> Throw error is stack is empty.
	public T pop() {
		emptyError();
		return list.removeLast();
	}

	// Peek the top of the stack without removing an element
	// --> Throw error is stack is empty.
	public T peek() {
		emptyError();
		return list.peekLast();
	}

	// Allow users to iterate through the stack using an iterator
	@Override public java.util.Iterator <T> iterator () {
		return list.iterator();
	}
} 