package jul20;

public class lab001 {
    public static void main(String[] args) {
        String a="basha";
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println(rev);
    }
}
