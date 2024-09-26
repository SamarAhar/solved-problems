public class Permutation {
    public static void findPermutation(String str, String ans){  //TC = O(n*n!)
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "abcd";

        findPermutation(str, "");
    }
}
