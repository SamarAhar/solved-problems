public class xPowerN {
    // public static int power(int a, int n){
    //     if(n == 0){
    //         return 1;
    //     }

    //     return a * power(a, n-1);
    // }

    //optimized approach O(log n)
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = power(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]){
        System.out.println(power(2, 5));
    }
}
