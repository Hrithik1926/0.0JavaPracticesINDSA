package ArrayListDS;

import java.util.ArrayList;

public class PairSum2BruteForce {
    public static boolean pair(ArrayList<Integer> p,int t){
        for (int i=0;i<p.size();i++){
            for (int j=i+1;j<p.size();j++){
                int q=p.get(i)+p.get(j);
                if (q==t){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> p=new ArrayList<>();
        p.add(5);
        p.add(1);
        p.add(3);
        p.add(7);
        p.add(8);
        p.add(6);
        p.add(10);
        p.add(18);
        p.add(9);
        p.add(2);
        p.add(4);
        p.add(1);
        int t=28;
        System.out.println(pair(p,t));
    }
}
