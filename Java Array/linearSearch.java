
public class linearSearch {
    public static int search(String name[], String key){
        for(int i=0;i<name.length;i++){
            if(name[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String name[] = {"samar","vinit","shubham","ahar","tomar","rathi"};
        String key = "rathi";

        int index = search(name, key);

        if(index == -1){
            System.out.println("NOT found");
        }else{
            System.out.println("Key is at index : "+index);
        }
    }
}