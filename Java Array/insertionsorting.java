
public class insertionsorting {
    public static void sorting(Integer arr[]) {
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printarr(Integer arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Integer arr[] = {1,2,4,5,3};
       sorting(arr);
    //    Arrays.sort(arr,0,5);
    //    Arrays.sort(arr,Collections.reverseOrder());
        printarr(arr);
    }
}
