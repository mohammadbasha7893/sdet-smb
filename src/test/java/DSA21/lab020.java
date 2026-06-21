package DSA21;

public class lab020 {
	public static void main(String[] args) {
		String a = "hamasa";
		for (int i = 1; i < a.length(); i++) {
			int count = 0;
			char ch = a.charAt(i);
			for (int j = i + 1; j < a.length(); j++) {
				if (ch == a.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(ch + " = " + count);

			}
		}
	}

}
