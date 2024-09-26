public class bubblesorting {
    public static void bublesort(int arr[]) {
        for(int turn=0;turn<arr.length;turn++){
            //int swap = 0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //swap++;
                    //System.out.print("\nswaps : "+swap);
                }
            }
        }
    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {1,2,4,5,3};
        bublesort(arr);
        printarr(arr);
    }
}
