public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList(){
        // code here

    }
    //SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(Node head, int x){
        Node current = head;

    }
    // checking for value x in linked list
    public boolean search(Node head, int x) {
        Node current = head;  //initializes current
        while(current != null){
            if (current.value == x)
                return true;  //data found
            current = current.next;
            
        }
        return false;
    }

}
