import java.util.Arrays;

public class bubblesort {

    public static void bubble(int arr[]) {

        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void prints(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        Arrays.sort(arr);
        bubble(arr);
        prints(arr);
    }
}
