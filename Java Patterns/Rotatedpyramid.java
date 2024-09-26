import java.util.Scanner;

public class Rotatedpyramid {
    public static void pyramid(int n){
        //outer loop = rows
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }    
                //stars
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        System.out.print("Pattern : \n");
        pyramid(n);

        sc.close();
    }
}
