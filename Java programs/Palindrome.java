import java.util.Scanner;

public class Palindrome {

    public static int palindrom(int num){
        int reverse=0,lastdigit;

        while(num>0){
            lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        return(reverse);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int A = num;

        int reverse = palindrom(num);

        if(A == reverse){
            System.out.println(reverse + " is a palindrome number.");
        }else{
            System.out.println(reverse + " is not a palindrome number.");
        }
        sc.close();
    }
}
