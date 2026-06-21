package DSA21;

public class lab0019 {
	public static void main(String[] args) {
		String a = "hamasa";
		for (int i = 0; i < a.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(a.charAt(i));
			}
		}
	}

}
