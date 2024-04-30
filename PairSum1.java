package ArrayListDS;

import java.util.ArrayList;

public class PairSum1 {


          // Brute Force Approach


    public static boolean targett(ArrayList<Integer> pair,int target){

             for (int i=0;i<pair.size();i++){
              for (int j=i+1;j< pair.size();j++){
                  int k=pair.get(i)+pair.get(j);
                  if (k==target){
                      return true;
                  }
              }
          }
          return false;
      }
      public static void main(String[] args) {
        ArrayList<Integer> pair=new ArrayList<>();
        pair.add(4);
        pair.add(5);
        pair.add(7);
        pair.add(9);
        pair.add(3);
        pair.add(1);
        pair.add(6);
        int target=9;
        System.out.println(targett(pair,target));
    }
}
