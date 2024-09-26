import java.util.Scanner;

public class firstArray {
    public static void main(String args[]) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//maths
        marks[1] = sc.nextInt();//physics
        marks[2] = sc.nextInt();//chemistry

        System.out.println("maths : "+marks[0]);
        System.out.println("physics : "+marks[1]);
        System.out.println("chemistry : "+marks[2]);
        
        //marks[2] = marks[2]+2;
        //System.out.println("chemistry : "+marks[2]);

        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : "+percentage+ "%");

        System.out.println("length of array : "+marks.length);
        sc.close();
    }
}
