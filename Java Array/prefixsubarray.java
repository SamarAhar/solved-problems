public class prefixsubarray {
    public static void prefixSum(int num[]){    //TIME COMPLEXITY = O(n^2)
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length]; //prefix array

        prefix[0] = num[0];
        for(int i=1;i<num.length;i++){      //calculating the sum
            prefix[i] = prefix[i-1] + num[i];
        }
        for(int i=0;i<num.length;i++){      //start

            for(int j=i;j<num.length;j++){  //end

                currSum = 0;
                // if(i == 0){
                //     currSum = prefix[j];
                // }else{
                //     currSum = prefix[j] - prefix[i-1];
                // }
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : "+maxSum);
    }

    public static void main(String args[]) {
        int num[] = {1,-2,6,-1,3};
        prefixSum(num);
    }
}
