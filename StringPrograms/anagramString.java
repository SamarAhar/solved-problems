import java.util.Arrays;

public class anagramString {
    public static void main(String args[]){
        String str = "earth";
        String str1 = "Heart";

        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length()){
            char[] strchararray = str.toCharArray();
            char[] str1chararray = str1.toCharArray();

            Arrays.sort(strchararray);
            Arrays.sort(str1chararray);

            boolean result = Arrays.equals(strchararray, str1chararray);

            if(result){
                System.out.println(str+ " and " + str1 + " are anagrams of each other.");
            }else{
                System.out.println(str+ " and " + str1 + " are not anagrams of each other.");
            }
        }else{
            System.out.println(str+ " and " + str1 + " are not anagrams of each other.");
        }
    }
}
