
class outerClass{
    public void display(){
        System.out.println("This is an outer class");
    }
static class innerClass{
    public void show(){
        System.out.println("This is an inner class");
    }
}
}

class staticOops {
    public static void main(String args[]){
        outerClass.innerClass ob = new outerClass.innerClass();
        ob.show();
    }
}

