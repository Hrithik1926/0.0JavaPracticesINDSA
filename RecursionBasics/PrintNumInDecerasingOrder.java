package RecursionBasics;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrintNumInDecerasingOrder {
    public static void printDec(int n){
        //Base Case
        if (n==1){
            System.out.print(n);
            return;
        }
        //Kaam
        System.out.print(n+" ");
        //Inner Call
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDec(n);
    }
}
