package jul20;

public class lab002 {
    public static void main(String[] args) {
        //reverse string
        String a = "malayalam";
        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        System.out.println(rev);
    }
}
