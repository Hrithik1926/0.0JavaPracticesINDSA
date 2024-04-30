package ArrayListDS;

import java.util.ArrayList;

public class SwapInArrayList {
    public static void swap(ArrayList<Integer> l,int index1,int index2){
        int temp=l.get(index1);
        l.set(index1,l.get(index2));
        l.set(index2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(3);
        l.add(8);
        l.add(9);
        l.add(1);
        l.add(7);
        l.add(4);
        int index1=2, index2=4;
        System.out.print(l);
        System.out.println();
        swap(l,index1,index2);
        System.out.println(l);
    }
}
