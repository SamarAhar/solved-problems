public class Subsets {
    public static void findSubsets(String str, String ans, int i){ // TC = O(n * n^2)
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print(" null");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }

        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
    }

    public static void main(String args[]){
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
