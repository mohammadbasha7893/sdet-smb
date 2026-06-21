package DSA21;

public class lab013 {
	public static void main(String[] args) {
		int a[] = { 0, 9, 7, 6, 4, 3, 2, 1 };
		int lar = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > lar) {
				lar = a[i];
			}
		}
		System.out.println(lar);
	}

}
