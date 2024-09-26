public class reverseString {
    public static void main (String[] args) {
       
        String str= "My name is samar", rstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("My name is samar"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rstr= ch+rstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ rstr);
    }
}
