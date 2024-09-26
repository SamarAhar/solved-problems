public class reverseArray {

    public static void reverse(int num[]){
        int first=0, last=num.length-1;

        while(first < last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;

            first++;
            last--;
        }
    }

    public static void printarr(int num[]){
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int num[] = {9,8,7,6,5,4,3,2,1,0};

        reverse(num);
        printarr(num);
    }
}
