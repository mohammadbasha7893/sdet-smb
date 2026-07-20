package jul20;

public class lab007 {
    public static void main(String[] args) {
        //swapping 2 numbers without 3rd varible
        int a = 100;
        int b = 200;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
