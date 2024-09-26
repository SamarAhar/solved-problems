public class stackLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{
        static Node head = null;

        public boolean isEmpty(){
            return head == null;
        }

        //push operation
        public void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop operation
        public int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek operation
        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
