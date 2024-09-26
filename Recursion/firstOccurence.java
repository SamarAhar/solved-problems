public class firstOccurence {
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, key, i+1);
    }

    public static int lastOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccur(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,4,3,2,1};

        System.out.println(firstOccur(arr, 4, 0));
        System.out.println(lastOccur(arr, 1, 0));
    }
}
