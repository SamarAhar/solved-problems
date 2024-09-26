public class pairs {
    public static void pair(int num[]) { //tc=O(n^2)
        int tp=0;
       //current array
       for(int i=0;i<num.length;i++){
        int curr = num[i]; //1,2,3,4,5,6,7,8,9
        for(int j=i+1;j<num.length;j++){
            System.out.print("("+curr+","+num[j]+")"); //Make pairs
            tp++;
        }
        System.out.println();
       }
       System.out.println("Total Pairs : "+tp); // tp = (n*(n-1))/2
    }
    public static void main(String args[]) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        pair(num);
    }
}
