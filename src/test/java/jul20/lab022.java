package jul20;

public class lab022 {
    public static void main(String[] args) {
        int a[] = {3, 21, 1};
        int lar = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > lar) {
                lar = a[i];
            }

        }
        System.out.println(lar);
    }
}
