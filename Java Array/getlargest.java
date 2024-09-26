
public class getlargest {

    public static int getLargest(int num[]) {

        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infinity

        for(int i=0;i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest numver is : " + smallest);
        return largest;
    }
    public static void main(String args[]) {
        
        int num[] = {1,12,23,45,43,21,1,2,3,4,5,6,7,8,9,10};
        System.out.println("largest number is : "+ getLargest(num));
    }
}
