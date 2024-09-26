

public class ques {
    public static boolean  duplicate(int[] num) {

        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //binary search to find target in left to right boundary
public static int search(int[] nums,int target){
    int left = 0;
    int right = nums.length-1;

    int l = left;
    int r = right;
    // System.out.println(left+" "+right);
    while(l <= r){
    int mid = l + (r - l)/2;
    if(nums[mid] == target){
    return mid;
    }
    else if(nums[mid] > target){
    r = mid-1;
    }
    else{
    l = mid+1;
    }
    }
    return -1;
    }
    public static void main(String args[]) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 1;
        //System.out.println(duplicate(num));
        System.out.println("target : "+ search(nums,target));
    }
}
