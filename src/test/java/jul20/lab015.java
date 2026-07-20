package jul20;

public class lab015 {
    public static void main(String[] args) {
        //reverse number
        int a = 102;
        int rev = 0;
        while (a != 0) {
            rev = rev * 10 + a % 10;
            a = a / 10;
        }
        System.out.println(rev);

    }
}
