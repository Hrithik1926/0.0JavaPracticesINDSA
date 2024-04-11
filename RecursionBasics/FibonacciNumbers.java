package RecursionBasics;

public class FibonacciNumbers {
    public static int fibo(int n){
        if (n==0 ||n==1){
            return n;
        }
        int f=fibo(n-1);
        int f1=fibo(n-2);
        int f2=f+f1;
        return f2;
    }
    public static void main(String[] args) {
        System.out.print(" "+fibo(21));
        System.out.print(" "+fibo(22));
        System.out.print(" "+fibo(23));
        System.out.print(" "+fibo(24));


    }
}
