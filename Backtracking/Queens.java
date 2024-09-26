public class Queens {
    public static void printBoard(char board[][]){
        System.out.println("--------Chess Board--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //vertical left up diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //vertical right up diagonal
        for(int i=row-1,j=col+1;i>=0 && j < board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);//function call
                board[row][j] = 'x'; //backtracking step
            }
        }
    }


    static int count;
    public static void main(String args[]){  //Tc = O(n!)
        int n=4;
        char board[][] = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("\nTotal no of ways to solve nQueens = "+ count);
    }
}
