package DSA21;

public class lab0014 {
	public static void main(String[] args) {
		// smalleest elemengt in array
		int a[] = { 0, 9, 7, 6, 4, 3, 2, 1 };
		int small = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];

			}
		}
		System.out.println(small);
	}

}
