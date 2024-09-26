public class kadaneSum {
    
    public static void kadane(int num[]){   // Time complexity = O(n)
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<num.length;i++){

            currSum = currSum + num[i];

            if(currSum < 0){
                currSum = 0;
            }

            // if(maxSum <= currSum){
            //     maxSum = currSum;
            // }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum sum is : "+maxSum);
    }

    public static void main(String args[]) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(num);
    }
}
