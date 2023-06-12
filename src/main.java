public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(7);
        myLinkedList.append(11);
        myLinkedList.printList();

        System.out.println(myLinkedList.get(1).value);


    }
}