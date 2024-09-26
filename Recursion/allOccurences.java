public class allOccurences {
    public static void allOccur(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccur(arr, key, i+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,4,3,2,3,4,5,6,4,3,2,2,3,3,3};
        int key = 3;

        allOccur(arr, key, 0);
    }
}
