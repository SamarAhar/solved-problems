public class naturalSum {
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        return n + calcSum(n-1);
    }

    public static void main(String args[]){
        System.out.println(calcSum(5));
    }
}
