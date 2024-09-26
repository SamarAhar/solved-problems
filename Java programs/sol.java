public class sol{
    public static void main(String args[]){
        int arr[] = {0,2,4,1,3};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr[i] = arr[(arr[i]+3) % arr.length];
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}