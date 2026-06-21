package DSA21;

public class lab0017 {
	public static void main(String[] args) {
		String s = ")(*&^%$#@basha";
		String v = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(v);
	}

}
