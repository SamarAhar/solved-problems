import java.util.ArrayList;

public class ReverseList {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //reverse list  Tc = O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

        //maximum number
        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Maximum number = "+max);
    }
}
