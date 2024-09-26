import java.util.Scanner;

public class primeRange {
    public static boolean prime(int n){

        if(n == 0 || n == 1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
          }
        }
        public static void primeInRange(int n){
            for(int i=2;i<=n;i++){
                if(prime(i)){ //true
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }
        
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range : ");
        int n = sc.nextInt();

        primeInRange(n);
        sc.close();
    }
}
