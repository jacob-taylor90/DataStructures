package LinkedList;
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

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
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

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

	public Node get(int index) {
	    if (index < 0 || index >= length) {
	        return null;
	    }
	    Node temp = head;
	    for (int i = 0; i < index; i++) {
	        temp = temp.next;
	    }
	    return temp;
	}

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
	    //Return false if index is out of bounds
	    if (index < 0 || index > length) return false;
	    //Call prepend if index is 0 
	    if (index == 0) {
	        prepend(value);
	        return true;
	    }
	    //Call append if index is equal to length
	    if (index == length) {
	        append(value);
	        return true;
	    }
	    //Insert new node in middle
	    Node newNode = new Node(value);
	    Node temp = get(index - 1);
	    
	    newNode.next = temp.next;
	    temp.next = newNode;
	    length++;
	    return true;
	}

    public Node remove (int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
	    Node temp = head;
	    head = tail;
	    tail = temp;
	    Node after = temp.next;
	    Node before = null;
	    for (int i = 0; i < length; i++) {
	        after = temp.next;
	        temp.next = before;
	        before = temp;
	        temp = after;
	    }
	}

    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;
        
        for (int i=0; i < k; i++) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }
            
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
   }

    public void reverseBetween(int m, int n) {
        if (head == null) return;
        
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        
        Node prev = dummyNode;
        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }
        Node current = prev.next; 
        for(int i = 0; i < n -m; i++) {
            Node temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        head = dummyNode.next;
    }

    public void partitionList(int x) {
        //check if list is empty
        if (head == null) return;
        
        //create two dummy nodes and two pointer nodes to keep track of the two partitions
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        
        Node current = head;
        
        //Loop to run until current hits the end of the list
        while(current != null) {
            //logic to place and concat the two partitions
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }
}

