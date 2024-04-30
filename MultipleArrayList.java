package ArrayListDS;

import java.util.ArrayList;

public class MultipleArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list1.add(8);
        list1.add(7);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(55);
        list2.add(28);
        list2.add(47);
        list2.add(13);
        list2.add(58);
        list2.add(27);
        mainList.add(list1);
        System.out.println(list1);
        mainList.add(list2);
        System.out.println(list2);
        System.out.println("************************************");
        //Nested For Loop

        for (int i=0;i<mainList.size();i++){
            ArrayList<Integer> currentList=mainList.get(i);
            for (int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
