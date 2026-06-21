package DSA21; // Package declaration

public class lab001 {
	// Program to reverse a string
	public static void main(String[] args) {
		// Original string
		String name = "Basha";
		// Variable to store the reversed string
		String rev = "";
		// Loop through the string from last character to first
		for (int i = name.length() - 1; i >= 0; i--) {
			// Append each character to 'rev'
			rev = rev + name.charAt(i);
		}
		// Print the reversed string
		System.out.println(rev);
	}
}
