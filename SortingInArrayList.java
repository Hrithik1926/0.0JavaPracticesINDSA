package ArrayListDS;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(3);
        l.add(8);
        l.add(9);
        l.add(1);
        l.add(7);
        l.add(4);

        System.out.println(l);
        Collections.sort(l);//Acending Order
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());//Decending Order
        System.out.println(l);
    }
}
