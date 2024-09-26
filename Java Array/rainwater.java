public class rainwater {
    public static int trappedwater(int height[]){   //Time Complexity = O(n)
        int n = height.length;

        // claculating left  max boundary
        int left[] = new int[n];
        left[0] = height[0];

        for(int i=1;i<n;i++){
            left[i] = Math.max(height[i], left[i-1]);
        }

        //calculate right max boundary
        int right[] = new int[n];
        right[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(height[i], right[i+1]);
        }

        int trappedwater = 0;
        
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(left[i], right[i]);
            trappedwater += waterlevel - height[i];
        }
        
        return trappedwater;
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water is : "+trappedwater(height));
    }
}
