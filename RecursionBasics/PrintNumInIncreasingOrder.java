package RecursionBasics;

import java.util.Scanner;

public class PrintNumInIncreasingOrder {
    public static void printIn(int n){
       if (n==1){
           System.out.print(n+" ");
           return;
       }
        printIn(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
printIn(n);
    }
}
