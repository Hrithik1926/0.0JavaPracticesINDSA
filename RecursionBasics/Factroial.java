package RecursionBasics;

public class Factroial {
    public static int fact(int n){
        if (n==0){
//            System.out.print(1);
            return 1;
        }
        int f1=fact(n-1);
        int f2=n*f1;
        return f2;
    }
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
}
