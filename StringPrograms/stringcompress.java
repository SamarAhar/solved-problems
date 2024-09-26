public class stringcompress {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str); 
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "abbbcd";

        System.out.println(compress(str));
    }
}
