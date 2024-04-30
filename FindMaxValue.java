package ArrayListDS;

import java.util.ArrayList;

public class FindMaxValue {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(5);
        List.add(7);
        List.add(2);
        List.add(8);
        List.add(3);
        List.add(0);
        List.add(2);
        List.add(1);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < List.size(); i++) {
            max = Math.max(max, List.get(i));
        }
        System.out.println("Max Element is :" + max);

    }
}
