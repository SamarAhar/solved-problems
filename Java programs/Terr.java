
import java.util.Scanner;

public class Terr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        
        String Result = (marks>=33? "pass":"fail");
        System.out.println(Result);
        sc.close();
        
    }
}
