package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.printList();
        myDLL.append(2);
        System.out.println("After Append");
        myDLL.printList();

        System.out.println("After RemoveLast");
        myDLL.removeLast();
        myDLL.printList();
    }
}
