public class staircasesearch {
    public static boolean stairsearch(int matrix[][],int key) { // O(n+m)
        int row = 0 ; int col = matrix.length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key is found at (" +row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key does not exist!");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                       //{17,18,19,20}};
       int key = 16;
       System.out.print(stairsearch(matrix,key));               
    }
}
