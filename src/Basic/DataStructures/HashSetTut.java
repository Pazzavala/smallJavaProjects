package Basic.DataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTut {
	public static void main(String[] args) {
		int[] a = {2,3,4,5};
		System.out.println(a[0]);

		

		HashSet<Integer> h = new HashSet<Integer>();
		HashSet<Integer> hashBrown = new HashSet<Integer>();

		hashBrown.add(32);

		h.add(1);
		h.add(2);
		h.add(3);
		h.add(43);
		h.add(234);


		System.out.println(h);
		System.out.println(h.contains(43));

		h.remove(43);

		System.out.println(h.contains(43));

		System.out.println(h.size());

		h.clear();

		System.out.println(h);
		System.out.println(h.isEmpty());

		int n = 20;
		for(int i = 0; i < n; i++) 
			h.add(i);

		Object[] arr = h.toArray();
		System.out.println(arr[13]);

		Iterator<Integer> it = h.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}