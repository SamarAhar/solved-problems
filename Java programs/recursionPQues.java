public class recursionPQues {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void occurence(int arr[],int i,int key) {
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        occurence(arr, i+1, key);
    }
    public static void printDigits(int n) {
        if(n == 0){
            return;
        }
        int lastDigit = n % 10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+ " ");
    }
    public static int length(String str) {
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void towerOfHanoi(int n,String src,String helper,String dest) {//O(2^n-1)orO(2n)
        if(n == 1){
            System.out.print("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("\ntransfer disk " + n + " from " + src + " to " + dest );

        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // occurence(arr, 0, 2);
        // printDigits(1247);
        // String str = "Samar Ahar";
        // System.out.println(length(str));
        towerOfHanoi(3, "S", "H", "D");
    }
}
