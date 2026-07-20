package jul20;

public class lab023 {
    public static void main(String[] args) {
        //finding largest number in array
        int a[] = {9, 7, 53, 0};
        int lar = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > lar) {
                lar = a[i];
            }
        }
        System.out.println(lar);
    }
}
