public class linkedList {

    //creating the list which is empty initially
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    // this variable is used to track the length of the list
    public static int size;


    // Adding elements in the list from the start
    public void addFirst(int data){
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - newNodenext = head
        newNode.next = head;  //link

        //step 3 - head = newNODE
        head = newNode;
    }

    //Adding elements in the list from the last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    // printing the list
    public void print(){ //Tc = O(n)
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Adding the element in the list in the middle
    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data); // Insert at the beginning of the list.
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //removing the element from the start of the list
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // removing the element from the list of the list
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size - 2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next = null;
        size--;
        return val;
    }

    //searching for an element is linkedlist using linear search tachnique, Tc : O(n);
    public int search(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }

            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive function to search for an element
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    //recursive function
    public int recSearch(int key){ // Tc : O(n);
        return helper(head, key);
    }

    // function to reverse a linked list, Tc : O(n);
    public void reverse(){ 
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //removing the nth element from the end of the linked list
    public void removeNthFromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; //removefirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Palindrome = Slow - Fast technique
    public Node findNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is the mid node
    }

    // complete palindrome function
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //find the mid node, calling the mid function
        Node midNode = findNode(head);

        // reverse the right part of the list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right part head
        Node left = head; // left part head

        //check left half and right half if they are same or not

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // To find ia circular cycle exist or not - Floyd's cycle finding algorithm
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true; // cycle exist
            }
        }
        return false; // cycle doesn't exist
    }

    //remove cycle from the list
    public void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
            if(cycle == false){
                return;
            }
        }

        //find meeting point
        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    //merge sort, find mid
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node
    }

    // merging the left and right half of the linked list
    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    //reursice function for mergesort
    public Node mergesort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getMid(head);

        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // Find mid
        Node slow = head;
        Node fast = head.next;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
    
        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null; // Set the next of mid to null to split the two halves
        Node prev = null;
        Node next;
    
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        // Merge zigzag arrangement
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
    
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
    
            left = nextL;
            right = nextR;
        }
    }
    

    public static void main(String args[]){
        linkedList ll = new linkedList();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        // ll.addLast(2);
        ll.addLast(1);

        // ll.add(0, 8);
        // ll.print();
        // System.out.println(size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(size);
        // ll.removeLast();
        ll.print();
        // System.out.println(size);
        // System.out.println("The key is at index : "+ll.search(3));
        // System.out.println("The key is at index : "+ll.recSearch(3));
        // ll.reverse();
        // ll.print();
        // ll.removeNthFromEnd(4);
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        // System.out.println(ll.isCycle());
        // head = ll.mergesort(head);
        // ll.print();
        ll.zigZag();
        ll.print();
    }
}
