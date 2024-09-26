public class stringcompres {
    public static void main(String args[]) {
        
    String input = "AAABBBBCC";
        
int count =1;
                
char last = input.charAt(0);
        
StringBuilder builder = new StringBuilder();
        
for(int i = 1; i < input.length(); i++){
    if(input.charAt(i) == last){
    count++;
    }else{
        if(count > 1){
            builder.append(""+count+last);
        }else{
            builder.append(last);
        }
    count = 1;
    last = input.charAt(i);
    }
}
if(count > 1){
    builder.append(""+count+last);
}else{
    builder.append(last);
}
System.out.println(builder.toString());
}
}
