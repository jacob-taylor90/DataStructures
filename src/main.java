public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("List before reversal");
        myLinkedList.printList();

        myLinkedList.reverseBetween(1, 3);
        System.out.println("List after reversal");
        myLinkedList.printList();
    }
}