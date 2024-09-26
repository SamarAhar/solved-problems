public class overloading {
    public static void main(String args[]){
        calculate calc = new calculate();
        System.out.println(calc.sum(1,3));
        System.out.println(calc.sum((float)1,(float)3));
        System.out.println(calc.sum(1,3, 4));
    }
}

class calculate{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
