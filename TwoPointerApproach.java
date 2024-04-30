package ArrayListDS;
import java.lang.management.MemoryType;
import java.util.ArrayList;
public class TwoPointerApproach {
    public static int  trap(ArrayList<Integer> height){
        int max=0;
       int  lp=0;
      int   rp= height.size()-1;
        while (lp<rp){
          int h=Math.min(height.get(lp),height.get(rp));
          int width=rp-lp;
          int store=width*h;
          max= Math.max(max,store);
          if (height.get(lp)<height.get(rp)){
              lp++;
          } else{
             rp--;
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
        System.out.println(trap(height));
    }
}
