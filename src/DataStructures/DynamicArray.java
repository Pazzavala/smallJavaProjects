package DataStructures;

import java.util.Iterator;

@SuppressWarnings("unchecked")

public class DynamicArray <T> implements Iterable<T> {
	private T[] arr;
	private int len;
	private int capacity;

	public DynamicArray() {
		this(16);
	}

	public DynamicArray(int capacity) {
		if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}

	// Function to return size of array
	public int size() {
		return this.len;
	}
	// function to check if array is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	// function to get the value at a ceratin index
	public T get(int index) {
		return arr[index];
	}
	// function to set a value at a certain index
	public void set(int index, T elem) {
		arr[index] = elem;
	}
	// function to clear the array
	public void clear() {
		for(int i = 0; i < capacity; i++)
			arr[i] = null;
	}
	// function to add an element to array
	public void add(T elem) {
		if (len+1 >= capacity) {
			if (capacity == 0)
				capacity = 1;
			else
				capacity *= 2;
			T[] new_arr = (T[]) new Object[capacity];

			for (int i = 0; i < capacity; i++)
				new_arr[i] = arr[i];

			arr = new_arr;
		}

		arr[len++] = elem;
	}
	// function to remove an element at a certain index
	// public T removeAt(int index) {

	// }
	// function to remove element if found return if found
	// public boolean remove(T elem) {
		
	// }
	// function to find index of specified element

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	// function to see if array contains element


} 