package ArrayListDS;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleDimentionOfArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> maintList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for (int i=1;i<=10;i++){
            list1.add(i*6);
            list2.add(i*7);
            list3.add(i*8);

        }
        maintList.add(list1);
        maintList.add(list2);
        maintList.add(list3);
        System.out.println(maintList);

        //Nested Lopp
        for (int i=0;i<maintList.size();i++){
            ArrayList<Integer> current=maintList.get(i);
            for (int j=0;j<current.size();j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(maintList);


    }
}
