package DSA21;

import java.util.HashSet;

public class lab0016 {
	public static void main(String[] args) {
		String a[] = { "a", "a", "b" };
		HashSet<String> set = new HashSet<>();
		for (String in : a) {
			set.add(in);
		}
		System.out.println(set);
	}

}
