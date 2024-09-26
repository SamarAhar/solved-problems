public class Recursion {
    public static void printDec(int n) {
        if(n == -10){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printInc(int n) {
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        // int fmn = fact(n-1);
        int fn = n * fact(n-1);

        return fn;
    }
    public static int naturalSum(int n) {
        if(n == 1){
            return 1;
        }
        int sum = n + naturalSum(n-1);
        return sum;
    }
    public static int fibo(int n) {
        if(n <= 1){
            return n;
        }else{
            return (fibo(n-1) + fibo(n-2));
        }
    }
    public static boolean sortedArr(int arr[],int i) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedArr(arr, i+1);
    }
    public static int fo(int arr[],int i,int key) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return fo(arr, i+1, key);
    }
    public static int lo(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = lo(arr, i+1, key);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n) {
        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);
    }
    public static int oPower(int a,int n) { //O(logn)
        if(n == 0){
            return 1;
        }

        int halfpower = oPower(a, n/2);
        int halfpowersq = halfpower * halfpower;

        if(n % 2 != 0){
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }
    public static int tilingProb(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int vertical = tilingProb(n-1);

        int horizontal = tilingProb(n-2);

        int totalWays = vertical + horizontal;

        return totalWays;
    }
    public static void dupChar(String str,int idx,StringBuilder newStr,boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curChar = str.charAt(idx);
        if(map[curChar - 'a'] == true){
            dupChar(str, idx+1, newStr, map);
        }else{
            map[curChar - 'a'] = true;
            dupChar(str, idx+1, newStr.append(curChar), map);
        }
    }
    public static int freindsPairing(int n) {
            if(n == 1 || n== 2){
                return n;
            }
            int totalWays = freindsPairing(n-1) + (n-1) * freindsPairing(n-2);

            return totalWays;
    }
    public static void binaryStr(int n,int lastPlace,String str) {
        if(n == 0){
            System.out.println(str);
            return;
        }
        binaryStr(n-1,1,str+"1");
        if(lastPlace == 1){
            binaryStr(n-1, 0, str+"0");
        }
    }
    public static void main(String args[]) {
        //  int n = 4;
        // int arr[] = {1,2,3,4,5,5,7,8,9,0}; 
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(naturalSum(n));
        // for(int i = 0; i <= n; i++){
        //     System.out.print(fibo(i) + " ");
        // }
        // System.out.println(fibo(n));
        // System.out.println(sortedArr(arr, 0));
        // System.out.println(fo(arr, 0,10));
        // System.out.println(lo(arr, 0, 1));
        // System.out.println(power(2, 10));
        // System.out.println(oPower(2, n));
        // System.out.println(tilingProb(4));
        // String str = "Appnaacollege";
        // dupChar(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(freindsPairing(n));
        binaryStr(4, 0, "");
    }
}