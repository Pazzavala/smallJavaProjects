package DataStructures;

import java.util.*;

class PQueue <T extends Comparable<T>> {

	// The number of elements currently inside the heap
	private int heapSize = 0;

	// The internal capacity of the heap
	private int heapCapacity = 0;

	// A dynamic list to track the elements inside the heap
	private List <T> heap = null;

	// Map to keep track of possible indicies a particular
	// node value is found in the heap.
	private Map <T, TreeSet<Integer>> map = new HashMap<>();

	// Construct an empty PQ
	public PQueue() {
		this(1);
	}

	// Construct a PQ with an initial capacity
	public PQueue(int sz) {
		heap = new ArrayList<>(sz);
	}

	public PQueue(T[] elems) {
		heapSize = heapCapacity = elems.length;
		heap = new ArrayList<T>(heapCapacity);

		for(int i = 0; i < heapSize; i++) {
			mapAdd(elems[i], i);
			heap.add(elems[i]);
		}
	}

	public PQueue(Collection <T> elems) {
		this(elems.size());
		for(T elem: elems)
			add(elem);
	}

	public boolean isEmpty() {
		return heapSize == 0;
	}

	public void clear() {
		for(int i = 0; i < heapCapacity; i++)
			heap.set(i, null);

		heapSize = 0;
		map.clear();
	}

	public int size() {
		return heapSize;
	}

	public T peek() 
	{
		if(isEmpty())
			return null;

		return heap.get(0);
	}

	public T poll() {
		return heap.remove(0);
	}

	public boolean contains(T elem) {
		if(elem == null)
			return false;

		return map.containsKey(elem);
	}

	public void add(T elem) {
		if(elem == null)
			throw new IllegalArgumentException();

		if(heapSize < heapCapacity) {
			heap.set(heapSize, elem);
		} else {
			heap.add(elem);
			heapCapacity++;
		}
	
		mapAdd(elem, heapSize);

		swim(heapSize);
		heapSize++;
	}

	public boolean less(int i, int j) {
		T node1 = heap.get(i);
		T node2 = heap.get(j);

		return node1.compareTo(node2) <= 0;
	}

	private void swim(int k) {
		int parent = (k - 1) / 2;

		while(k > 0 && less(k, parent)) {
			swap(parent, k);
			k = parent;
		}

		parent = (k - 1) / 2;
	}

	private void sink(int k) {
		while(true) {
			int left = k * 2 + 1;
			int right = k * 2 + 2;
			int smallest = left;

			if(right < heapSize	&& less(right, left))
				smallest = right;

			if(left >= heapSize	|| less(k, smallest))
				break;

			swap(smallest, k);
			k = smallest;
		}
	}

	private void swap(int i, int j) {
		T i_elem = heap.get(i);
		T j_elem = heap.get(j);

		heap.set(i, j_elem);
		heap.set(j, j_elem);

		mapSwap(i_elem, j_elem, i, j);
	}

	public boolean remove(T elem) {

		if(elem == null)
			return false;

		TreeSet<Integer> ts = new TreeSet<>();
		ts = map.get(elem);

		Integer	index = ts.first();

		if(index != null)
			removeAt(index);

		return index != null;
	}

	private T removeAt(int i) {
		if(isEmpty())
			return null;

		heapSize--;
		T removed_data = heap.get(i);
		swap(i, heapSize);

		heap.set(heapSize, null);
		mapRemove(removed_data, heapSize);

		if(i == heapSize)
			return removed_data;

		T elem = heap.get(i);

		sink(i);

		if(heap.get(i).equals(elem))
			swim(i);

		return removed_data;
	}

	public boolean isMinHeap(int k) {
		if(k >= heapSize)
			return true;

		int left = k * 2 + 1;
		int right = k * 2 + 2;

		if(left < heapSize && !less(k, left))
			return false;

		if(right < heapSize && isMinHeap(right))
			return false;

		return isMinHeap(left) && isMinHeap(right);        
	}

	private void mapAdd(T value, int index) {
		TreeSet	<Integer> set = map.get(value);

		if(set == null) {
			set = new TreeSet<>();
			set.add(index);
			map.put(value, set);
		} else
			set.add(index);
	}

	private	void mapRemove(T value, int index) {
		TreeSet <Integer> set = map.get(value);
		set.remove(index);
		if(set.size() == 0)
			map.remove(value);
	}

	private	void mapSwap(T val1, T val2, int val1Index, int val2Index) {
		Set <Integer> set1 = map.get(val1);
		Set <Integer> set2 = map.get(val2);

		set1.remove(val1Index);
		set2.remove(val2Index);

		set1.add(val2Index);
		set2.add(val1Index);
	}

	@Override public String toString() {
		return heap.toString();
	}
}