public class backtraking {
    public static void changearr(int arr[], int i, int value){
        //base case
        if(i == arr.length){
            printarr(arr);
            return;
        }

        //recursion
        arr[i] = value;
        changearr(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void subsets(String str, String ans, int i ) {
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("Null");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }
        subsets(str, ans+str.charAt(i), i+1);
        subsets(str, ans, i+1);
    }

    public static void main(String args[]){
        // int arr[] = new int[5];
        // changearr(arr, 0, 1);
        // printarr(arr);
        String str = "abc";
        subsets(str, "", 0);
    }
}
