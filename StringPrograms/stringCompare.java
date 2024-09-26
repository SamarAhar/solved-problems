public class stringCompare {
    public static void main(String args[]) {
        String s1 = "Samar";
        String s2 = "Samar";
        String s3 = new String("Samar");

        if(s1==s2){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("strings are not equal.");
        }
    }
}
