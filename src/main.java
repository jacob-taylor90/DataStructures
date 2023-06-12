public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(7);
        myLinkedList.prepend(11);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            Expected OUTPUT:
            ----------------
            Head: 11
            Tail: 7
            Length: 3

            Linked List: 
            11
            4
            7
         */
    }
}
