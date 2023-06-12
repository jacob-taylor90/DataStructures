public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(7);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            Expected OUTPUT:
            ----------------
            Head: 4
            Tail: 7
            Length: 2

            Linked List: 
            4 7
         */
    }
}
