import java.util.Scanner;

public class floydsTriangle {
    public static void triangle(int n) {
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();
        System.out.println("Triangle : ");
        triangle(n);

        sc.close();
    }
}
