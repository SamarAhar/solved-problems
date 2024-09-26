import java.util.*;

public class leadernumber {
    public static void leader(int arr[],int n) {

        for(int i = 0; i < n; i++){
            int j;
            for(j = i+1; j < n; j++){
                if(arr[i] <= arr[j])
                    break;
            }
            if(j == n){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer> Leaders = new ArrayList<Integer>();
        Leaders.add(arr[n-1]);
        int m = arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= m){
                m = arr[i];
                Leaders.add(0,arr[i]);
            }
        }
        return Leaders;
    }
    static ArrayList<Integer> findleaders(int arr[], int n){

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(arr[n-1]);
        int max = arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = {4,5,7,9,13,2,6,1};
        int N = arr.length;
        leader(arr, N);
        System.out.println(leaders(arr, N));
    }
}
