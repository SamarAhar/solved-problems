
import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : " );
        int year = sc.nextInt();

        if(year%4==0){
           System.out.println("Leap Year : " + year);
        }  
        else if(year%100!=0) { 
           System.out.println("Not a Leap Year : " + year);
        }  
        else if(year%100==0 && year%400==0){
            System.out.println("Leap Year : " + year);
        } 
        else{
            System.out.println("Not a Leap Year" + year);
        }   
        sc.close();
    }
}
