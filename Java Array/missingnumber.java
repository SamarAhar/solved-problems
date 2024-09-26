public class missingnumber {
    public static int missingNum(int arr[],int n) {
        int sumofarr = 0;

        for(int i=0;i<n-1;i++){
            sumofarr += arr[i];
        } 
        return (n*(n+1))/2 - sumofarr;  
    }

    public static void main(String args[]) {
        int arr[] = {2,3,4,1,6,7,8,9,0};
        int N = arr.length;
        System.out.println(missingNum(arr, N));
    }
}
