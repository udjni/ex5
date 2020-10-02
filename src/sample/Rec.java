package sample;
public class Rec {
    public static int recursion(int n){
        if(n<=10)
            return 1;
        else
            return  0;
    }
    public static void main(String[] args) {
        int n=10;
        if(recursion(n)==1)
            for(int i=1;i<=n;i++)
            System.out.print(i+" ");
    }
}
