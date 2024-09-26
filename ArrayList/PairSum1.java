import java.util.ArrayList;

public class PairSum1 {
    //Brute Force
    // public static boolean sum(ArrayList<Integer>pairSum, int Target){
    //     for(int i=0;i<pairSum.size();i++){
    //         for(int j=i+1;j<pairSum.size();j++){
    //             if(pairSum.get(i) + pairSum.get(j) == Target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // 2 pointer approach
    public static boolean sum(ArrayList<Integer>pairSum, int Target){
        int lp = 0;
        int rp = pairSum.size()-1;

        while(lp < rp){
            if(pairSum.get(lp) + pairSum.get(rp) == Target){
                return true;
            }else if(pairSum.get(lp) + pairSum.get(rp) < Target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer>pairSum = new ArrayList<>();
        pairSum.add(1);
        pairSum.add(2);
        pairSum.add(3);
        pairSum.add(4);
        pairSum.add(5);
        int Target = 5;

        System.out.println(sum(pairSum, Target));
    }
}
