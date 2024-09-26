public class selectionsort {
    public static void sort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int max = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
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
        sort(arr);
        prints(arr);
    }
}
