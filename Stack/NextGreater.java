import java.util.Stack;

public class NextGreater {
    public static void main(String args[]){  //Tc : O(n)
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer>s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //while loop
            while(!s.empty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            //if else statement
            if(s.empty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            //push in stack
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
