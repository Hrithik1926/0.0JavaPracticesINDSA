package ArrayListDS;
import java.util.*;
public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(15);//O(1)
        l1.add(1);
        l1.add(2);
        l1.add(10);
        l1.add(5);
        l1.add(12);
        l1.add(35);
        l1.add(11);
        l1.add(13);
        l1.add(14);
        //Print List
        System.out.print(l1+" ");
        System.out.println();
        //Get Element By Index
        System.out.println(l1.get(5));
        //Size Of l1
        System.out.println(l1.size());

        //Delete Element
        l1.remove(4);
        System.out.println(l1);

        //Set Element
        l1.set(2,45);
        l1.set(7,405);
        l1.set(1,20);
        l1.set(3,100);
        l1.set(8,45);
        System.out.println(l1);

        //Contain Element

        System.out.println(l1.contains(54));
        System.out.println(l1.contains(45));

        System.out.println("************************************************************************************");
        l1.add(3,78);//O(n)
        System.out.println(l1);
        System.out.println(l1.size());
    }
}
