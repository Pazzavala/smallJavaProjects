package Basic.DataStructures;

public class UnionFind {
	private int size;	// Number of elements in this union find
	private int[] sz;	// Track sizes of each of the components 
	private int[] id;	// id[i] points to the parent of i, if id[i] = i then i is a root node
	private int numComponents;	// Track number of components in the union find

	public UnionFind(int size) {
		if (size <= 0)
			throw new IllegalArgumentException("Size <= 0 is not allowed");

		this.size = numComponents = size;
		sz = new int[size];
		id = new int[size];

		for(int i = 0; i < size; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	public int find(int p) {
		int root = p;
		//FInd the root of the component/set
		while(root != id[root]) 
			root = id[root];
		// Compress the path leading back to root.
		while(p != root) {
			int next = id[p];
			id[p] = root;
			p = next;
		}

		return root;
	}

	// Return wheather or not the elements 'p' and 'q'
	// are in the same components/sets.
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	// return the size of each component/set 'p' belongs to
	public int componentSize(int p) {
		return sz[p];
	}

	public int size() {
		return size;
	}
	// returns number of components/sets
	public int components() {
		return numComponents;
	}

	// Unify the compenents/sets containing elements 'p' 'q'
	public void unify(int p, int q) {
		int root1 = find(p);
		int root2 = find(q);

		// elements alredy in same group
		if (root1 == root2)
			return;

		// merge two compenents/sets together.
		// Merge smaller compenent/set into the larger one.
		if(sz[root1] < sz[root2]) {
			sz[root2] += sz[root1];
			id[root1] = root2;
		} else {
			sz[root1] += sz[root2];
			id[root2] = root1;
		}

		numComponents--;
	}

}