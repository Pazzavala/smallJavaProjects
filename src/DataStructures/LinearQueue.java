package DataStructures;

import java.util.Iterator;

// Implement a queue using an array.

public class LinearQueue <T> implements Iterable <T> {
	private int head, tail, capacity;
	private T[] arr;

	public LinearQueue() {
		this(16);
	}

	public LinearQueue(int capacity) {
		this.capacity = capacity;
		this.head = this.tail = -1;

//		arr =  new Object[capacity](<T>);
	}

	// Return the size of the queue
	public int size() {
		return this.capacity;
	}

	// Returns wheather or not the queue is empty
	public boolean isEmpty() {
		return head == -1;
	}

	public boolean isFull() {
		if (tail == capacity - 1)
			return true;
		return false;
	}

	private void emptyError() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");
	}


	// Add an element to the back of the queue
	private void enqueue(T elem) {
		if (isFull())
			throw new IllegalStateException();

		if(isEmpty())
			head++;
		arr[++tail] = elem;
	}

	// remove an element from the front of the queue
	// Method throws error if the queue is empty
	public T dequeue() {
		emptyError();

		T data = arr[head];

		if (head == tail) // This mean there is only one element left on queue
			head = tail = -1;
		else
			head++;

		return data;
	}

	// Peek the element at the fornt of the queue
	// Method throws error if the queue is empty
	public T peek() {
		emptyError();
		return arr[head];
	}

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}