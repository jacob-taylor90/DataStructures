public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(3);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);

        System.out.println("List before partition");
        myLinkedList.printList();

        myLinkedList.partitionList(5);
        System.out.println("List after partition");
        myLinkedList.printList();
    }
}