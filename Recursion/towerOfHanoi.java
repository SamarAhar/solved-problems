public class towerOfHanoi {
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("The disk move from disk '"+src+"' to disk '"+dest+"'");
            return;
        }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("The disk move from disk '"+src+"' to disk '"+dest+"'");

        towerofHanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]){
        int n = 3;
        towerofHanoi(n, "A", "B", "C");
    }
}
