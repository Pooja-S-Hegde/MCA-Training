class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head = null;

    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println(data + " inserted Succesfully");
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBegin(10);
        ll.insertAtBegin(20);
        ll.insertAtBegin(30);
        ll.insertAtBegin(40);
        ll.insertAtBegin(50);

    }
}
