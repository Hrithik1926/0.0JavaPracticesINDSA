package ArrayListDS;

import java.util.ArrayList;

public class ContainerContainWater {
    public static int showWater(ArrayList<Integer> height){
        int max=0;
        //Brute Force
        for (int i=0;i<height.size();i++){
            for (int j=i+1;j<height.size();j++){
                int h=Math.min(height.get(i),height.get(j));
                int widht=j-i;
                int current=h*widht;
                max=Math.max(max,current);
            }
        }
        return max;
}
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(5);
        height.add(7);
        height.add(2);
        height.add(9);
        height.add(8);
        height.add(3);
        height.add(1);
        height.add(7);
        System.out.println(height);
        System.out.println(showWater(height));
    }
}
