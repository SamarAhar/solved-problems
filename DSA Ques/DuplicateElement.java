
public class DuplicateElement{
    public static boolean  duplicate(int[] num) {

        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int num[] = {4,5,6,7,0,1,2,1};

        System.out.println(duplicate(num));
    }
}