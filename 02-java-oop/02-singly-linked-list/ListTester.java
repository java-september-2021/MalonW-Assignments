public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.add(11);
        sll.add(1);
        sll.add(150);
        sll.add(20);
        sll.remove(3);
        sll.remove(2);
        sll.printValues();
    
    if (sll.search(sll.head, 2))
        System.out.println("Yes");
    else
        System.out.println("No");
}
}


