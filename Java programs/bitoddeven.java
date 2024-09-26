public class bitoddeven{
    public static void oddoreven(int n) {
        int bitmask = 1;

        if((n & bitmask) == 0){
            System.out.println("Even number.");
        }else{
            System.out.println("Odd number.");
        }
    }
    public static int getithbit(int n,int i) {
        int bitmask = 1 << i;

        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithbit(int n,int i) {
        int bitmask = 1<<i;
        return (n | bitmask);
    }
    public static int clearithbit(int n,int i) {
        int bitmask = ~(1<<i);

        return (n & bitmask);
    }
    public static int updteithbit(int n,int i,int newbit) {
        if(newbit == 0){
            return clearithbit(n, i);
        }else{
            return setithbit(n, i);        }
    }
    public static int updateithbit(int n,int i,int newbit) {
        n = clearithbit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }
    public static int clearlastbit(int n,int i) {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int  clearrangebits(int n,int i,int j) {
        int a = (~0) << j+1;
        int b = (i<<1) - 1;

        int bitmask = a | b;

        return n & bitmask;
    }
    public static boolean powerof2(int n) {
        return(n &(n-1)) == 0;
    }
    public static int countsetbits(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int fastexpo(int a, int n) {
        int ans = 1;
        while(n > 0){
           if((n & 1) != 0){ //check LSB
            ans = ans * a;
           }
           a = a * a;
           n = n >> 1;
        }
        return ans;
    }
    public static void main(String args[]) {
        oddoreven(6);
        System.out.println(getithbit(10, 1));
        System.out.println(setithbit(10, 0));
        System.out.println(clearithbit(10, 1));
        System.out.println(updteithbit(10, 2, 1));
        System.out.println(updateithbit(10, 2, 1));
        System.out.println(clearlastbit(15, 2));
        System.out.println(clearrangebits(10, 2, 4));
        System.out.println(powerof2(15));
        System.out.println(countsetbits(25));
        System.out.println(fastexpo(3, 5));
    }
}