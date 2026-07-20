package jul20;

public class lab025 {
    public static void main(String[] args) {
        String s=")(*&^%$#basha";
        String b=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(b);
    }
}
