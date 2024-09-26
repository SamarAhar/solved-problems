public class friendPairs {
    public static int friendsPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choice single
        int fnm1 = friendsPair(n-1);

        //choice pair
        int fnm2 = friendsPair(n-2);

        int totalways = fnm1 + fnm2;

        return totalways;
    }

    public static void main(String args[]){
        System.out.println(friendsPair(3));
    }
}
