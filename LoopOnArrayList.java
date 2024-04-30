package ArrayListDS;

import java.util.ArrayList;

public class LoopOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(8);
       //Print ArrayList
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();

        //Reverse oF ArrayList O(n)
        for (int i=l.size()-1;i>=0;i--){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
    }
}
