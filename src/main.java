public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("LinkedList Before Remove");
        myLinkedList.printList();

        myLinkedList.remove(1);

        System.out.println("LinkedList After Remove");
        myLinkedList.printList();
    }
}