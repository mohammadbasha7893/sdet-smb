package jul20;

public class lab024 {
    public static void main(String[] args) {
        //finding smallest number
        int a[]={3,2,1};
        int small=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<small){
                small=a[i];
            }
        }
        System.out.println(small);
    }
}
