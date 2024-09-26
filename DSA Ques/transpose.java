public class transpose {
    //print the original matrix
    public static void printmatrix(int matrix[][]) {

        System.out.println("The matrix is : ");

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int row = 2; int col = 3;
        int matrix[][] = {{2,3,7},{5,6,7}};

        printmatrix(matrix);

        int Transpose[][] = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Transpose[j][i] = matrix[i][j];
            }
        }
        printmatrix(Transpose);
    }
}
