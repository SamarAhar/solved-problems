
import java.util.*;

public class primeNo {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    if(n ==1 || n == 0){
        System.out.print("Not a prime number");
    }else{
        boolean isPrime = true;
        for (int i =2;i<=Math.sqrt(n);i++) {
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.print("prime number");    
        }else{
            System.out.print("a consonant");
        }
        sc.close();
    }
  }
}
