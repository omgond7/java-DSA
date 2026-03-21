class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at position
    public void insert(int data, int position) {

        if (position < 1) {
            throw new IllegalArgumentException("Position must be >= 1");
        }

        Node newNode = new Node(data);

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of range");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void delete() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null) {
            head=null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if(position<1) throw  new IllegalArgumentException("Position must be >= 1");
        if(position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 1;i< position -1 || temp.next != null;i++)
        {
            temp = temp.next;
        }
        if(temp.next == null) throw new IndexOutOfBoundsException("Position out of range");
        temp.next =temp.next.next;

    }
    public int count() {
	    if(head == null) return 0;
        int count = 0;
        Node temp = head;
        while(temp.next != null) {
            temp=temp.next;
            count++;
        }
        return count;
    }
    
}

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.insert(5, 1);   // beginning
        list.insert(15, 3);  // middle
        list.insert(40, 10); // invalid (will throw error)

        list.display();
    }
}


