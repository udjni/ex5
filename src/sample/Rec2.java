package sample;
public class Rec2 {
    public static int recursion(int n){
        if (n>100&&n<1000)
            return 1;
        else  if(n>10&&n<100)
            return 0;
        else
            return n;
    }
    public static void main(String[] args) {
        int n=924,x=0;
        if (recursion(n)==1){
          x+=n%10*100;
          n/=10;
        }
        if (recursion(n)==0){
           x+=n%10*10;
           n/=10;
        }
        if (recursion(n)==n){
          x+=n;
        }
        System.out.println(x);
    }
}
