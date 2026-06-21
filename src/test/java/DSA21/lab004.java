package DSA21;

public class lab004 {
	// palindrome
	public static void main(String[] args) {
		String a = "AMMA";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		if (a.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
