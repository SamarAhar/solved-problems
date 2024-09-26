import java.util.Scanner;

public class funoverpara {
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static float sum(float a,float b,float c,float d){
        return a + b + c + d;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();  

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter value of c : ");
        int c = sc.nextInt();

        System.out.print("Enter value of d : ");
        int d = sc.nextInt();

        System.out.println("The sum of a and b is : "+sum(a,b));
        System.out.println("The sum of a,b and c is : "+sum(a,b,c));
        System.out.println("The sum of a,b,c and d is : "+sum(a,b,c,d));

        sc.close();
    }
}
