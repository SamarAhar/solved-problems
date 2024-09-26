
public class count {
    public static void main(String args[]) {

        int arr[][] = {{1,2,3,4,3},{4,2,5,3,4,3,2,1}};
        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 3){
                    count ++;
                }
            }
        }
        System.out.println("count of 3 is : "+count);
    }
}
