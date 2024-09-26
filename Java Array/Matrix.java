import java.util.Scanner;

public class Matrix{
    public static boolean search(int matrix[][],int key) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print("found at index ("+i+" , "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int m = matrix.length , n = matrix[0].length;
        
        //input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 4);
        sc.close();
    }
}