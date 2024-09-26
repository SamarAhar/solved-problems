public class bruteForce {
    public static void subarrays(int num[]){    // BRUTE FORCE  , TIME COMPLEXITY = O(n)

        int tsa=0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){ // start

            for(int j=i+1;j<num.length;j++){ //end
                currSum=0;
                for(int k=i;k<=j;k++){ 
                    // System.out.print(num[k]+" ");  //print subarrays
                    currSum += num[k];
                }
                tsa++;
                System.out.println();
                System.out.println("Current Sum : "+currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum : "+maxSum);
        System.out.println("Total subarrays : "+tsa);
    }
       public static void main(String args[]) {
        int num[] = {1,-2,6,-1,3};
        subarrays(num);
    }
}
