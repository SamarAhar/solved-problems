import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
    public static void swap(ArrayList<Integer>list, int idx1, int idx3){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx3));
        list.set(idx3, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(9);

        int idx1 = 1, idx3 = 3;

        // Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list+" ");
        swap(list, idx1, idx3);
        System.out.println(list);
    }
}
