package DataStructures;

import java.util.HashMap;

public class HashMapTut {


	public static void main (String[] args) {
		int[] aa = {1,2,23,4};


		// USeful way to itterate a array
		for (int i : aa)
			System.out.println(i);

		int a = 10;
		int b = 2;
		int c = 22;

		HashMap<String, Integer> happy = new HashMap<String, Integer>();

		happy.put("a", a);
		happy.put("b", b);
		happy.put("c", c);

		System.out.println(happy);
		System.out.println(happy.get("c"));


		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("bobbyJoe", "FluffyPup");
		fun.put("Hellokity", "pasweord");
		fun.put("Goofy", "lastDigitsOfPI");

		System.out.println(fun);

		fun.remove("bobbyJoe");

		System.out.println(fun);
		System.out.println(fun.containsKey("bobbyJoe"));
		System.out.println(fun.containsValue("pasweord"));
		System.out.println(fun.size());
		System.out.println(fun.replace("Hellokity", "AloeVera"));
		System.out.println(fun.get("Hellokity"));
		System.out.println(fun);
		System.out.println(fun.values());
		System.out.println(fun.keySet());

	}
}