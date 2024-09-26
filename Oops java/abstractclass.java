public class abstractclass {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animaal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}