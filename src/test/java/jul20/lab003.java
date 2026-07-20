package jul20;

public class lab003 {
    public static void main(String[] args) {
        //palindrome code
        String a = "madam";
        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);

        }
        System.out.println("rev = " + rev);
        if (a.equals(rev)) {
            System.out.println("palindorme");
        } else {
            System.out.println("not palindrome");
        }
    }
}
