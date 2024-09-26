import java.util.Scanner;

public class functionParameterSyntax {
    public static int calculateSum(int a, int b){ //Parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //Arguments or actual parameters
        System.out.println("Sum is : "+sum);
        sc.close();
    }
}
