package ArrayListDS;

import java.util.ArrayList;

public class PairSum2PionterApproach {
    public static boolean P(ArrayList<Integer> pair, int target){
        int lp=0;
        int rp=pair.size()-1;
        while (lp!=rp){
            if ((pair.get(lp)+pair.get(rp))==target){
                return true;
            }
            if ((pair.get(lp)+pair.get(rp))<target){
                lp++;
            }else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pair=new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(4);
        pair.add(5);
        pair.add(6);
        pair.add(8);
        pair.add(9);
        int target=87;
        System.out.println(P(pair,target));
    }
}
