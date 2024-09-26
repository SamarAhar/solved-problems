import java.util.Scanner;

public class hollowRectangle {
    public static void holoRectangle(int tot_rows,int tot_col){

        //outer loop = rows
        for(int i=1;i<=tot_rows;i++){
            //inner loop = columns
            for(int j=1;j<=tot_col;j++){
                if(i==1 || i==tot_rows || j==1 || j==tot_col){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of rows : ");
    int tot_rows = sc.nextInt();
    System.out.print("Enter the number of columns : ");
    int tot_col = sc.nextInt();

    holoRectangle(tot_rows,tot_col);
    sc.close();
    }
}
