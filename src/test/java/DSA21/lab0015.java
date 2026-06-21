package DSA21;

import java.util.HashSet;

public class lab0015 {
	public static void main(String[] args) {
		// remove duplicate elements in array
		int a[] = { 0, 9, 7, 6, 4, 0, 4, 1, 3, 2, 1 };
		HashSet<Integer> set = new HashSet<>();
		for (Integer in : a) {
			set.add(in);
		}
		System.out.println(set);
	}

}
