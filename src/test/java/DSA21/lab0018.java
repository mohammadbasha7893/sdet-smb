package DSA21;

public class lab0018 {
	public static void main(String[] args) {
		// find duplicate characteres
		String a = "shaikmahammad";
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
