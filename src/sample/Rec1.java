package sample;
public class Rec1 {
    public static int recursion(int N){
         if (N>100&&N<1000)
            return 1;
      else  if(N>10&&N<100)
            return 0;
       else
            return N;
    }
    public static void main(String[] args) {
        int N=108;
        int s=0;
        if (recursion(N)==1){
            s+=N/100;
            N=N-s*100;
        }
        if (recursion(N)==0){
            s+=N/10;
            N=N%10;
        }
        if (recursion(N)==N){
            s+=N;
        }
        System.out.println(s);
    }
}
