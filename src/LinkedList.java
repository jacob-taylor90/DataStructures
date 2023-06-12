public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
    
        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
       /*
            1. Create new node with value
            2. check if linked list is null
              a. if null, point head & tail to new node
              b. else, iterate through linked list and find last index
            3. point last index to new node
            4. point tail to new node
        */
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    //Method to remove the last item in the LinkedList
    public Node removeLast() {
	    if (length == 0) return null;
	    
	    Node temp = head;
	    Node pre = head;
	    
	    while (temp.next != null) {
	        pre = temp;
	        temp = temp.next;
	    }
	    tail = pre;
	    tail.next = null;
	    length--;
	    
	    if(length == 0) {
	        head = null;
	        tail = null;
	    }
	    return temp;
	}

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}