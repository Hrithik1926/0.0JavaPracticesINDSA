package ArrayListDS;

import java.util.ArrayList;

public class PairSum2_2PointerApproach {
    public static boolean pair(ArrayList<Integer> p, int t){
       int privot=0;
       for (int i=0;i<p.size();i++){
           if (p.get(i)>p.get(i+1)){
               privot=i;
               break;
           }
       }
int lp=privot+1;//Smallest
       int rp=privot;//Larget
        while (lp!=rp){
            //Case one
            if ((p.get(rp)+p.get(lp))==t){
             return true;
            }
            //Case2
            if ((p.get(rp)+p.get(lp))<t){
                lp=(lp+1)%p.size();
            }else {
                rp=(p.size()+rp-1)%p.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> p=new ArrayList<>();
        p.add(5);
        p.add(6);
        p.add(7);
        p.add(8);
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);

        int t=16;
        System.out.println(pair(p,t));
    }
}
