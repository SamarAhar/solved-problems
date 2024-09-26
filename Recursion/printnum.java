public class printnum {
    public static void printDecNum(int n){
        //base case
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDecNum(n-1);
    }

    public static void printIncNum(int n){
        if(n == 1){
            System.out.print("\n"+n+" ");
            return;
        }
        printIncNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        printDecNum(10);
        printIncNum(10);
    }
}
