package RecursionBasics;

public class SumOfNNaturalNumber {
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int s=sum(n-1);
        int sa=n+s;
        return sa;
    }
    public static void main(String[] args) {
        System.out.print(sum(7));
    }
}
