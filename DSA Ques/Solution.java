import java.util.*;

class Solution {
    public static List<Integer> findClosestElements(int arr[], int k, int x) {
        int left = 0, right = arr.length - k - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(arr[left + i]);
        }
        return ans;
    }
    public static void main(String args[]){
       int arr[] = {1,2,3,4,5,6,7,8,9,0};

       System.out.println(findClosestElements(arr,3,5));
    }
}