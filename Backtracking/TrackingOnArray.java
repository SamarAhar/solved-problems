public class TrackingOnArray {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void backTrack(int arr[], int i, int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }

        arr[i] = val;
        backTrack(arr, i+1, val+1);
        arr[i] = arr[i] -2; //backtracking step
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        backTrack(arr, 0, 1);
        printArr(arr);
    }
}
