package Linked_List;

public class Singly_Linked_List {
    Node head;      // Declaration of head

    // Declaration of node class
    // we made static class, so that we can access it without making object of this class just by using class name
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to insert a node at head
    public void insert_front(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            head.next = null;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    // Method to insert a node at last
    public void insert_last(int data) {
        Node newnode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        newnode.next = null;
    }

    // Method to insert a node at given position
    public Node insert_at_specific_position(int data, int pos) {
        Node newnode = new Node(data);
        if (pos < 1) {
            System.out.print("Invalid position");
            return null;
        }
        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        int c = 1;
        Node current = head;
        while (c != pos - 1 && current != null) {
            current = current.next;
            c++;
        }
        newnode.next = current.next;
        current.next = newnode;
        return head;
    }

    // Method to insert a node before given position
    public Node insert_before_node_at_specific_position(int data, int pos) {
        Node newnode = new Node(data);
        int c = 1;
        Node current = head;
        if (pos < 1) {
            System.out.println("Invalid position.");
            return null;
        }
        while (c < pos - 2 && current != null) {
            c++;
            current = current.next;
        }
        newnode.next = current.next;
        current.next = newnode;
        return head;
    }

    // Method to insert a node after given position
    public Node insert_after_node_at_specific_position(int data, int pos) {
        Node newnode = new Node(data);
        int c = 1;
        Node current = head;
        if (pos < 1) {
            System.out.println("Invalid position.");
            return null;
        }
        while (c < pos && current != null) {
            c++;
            current = current.next;
        }
        newnode.next = current.next;
        current.next = newnode;
        return head;
    }

    // Method to delete first node
    public Node delete_first_node(){
        Node temp=head;
        if(temp==null){
            System.out.println("Invalid action, LL is empty.");
            return null;
        }
        if(temp.next==null){
            System.out.println("Only one node is present that is deleted, now LL is empty.");
            return null;
        }
        return temp.next;
    }

    // Method to delete last node
    public Node delete_last_node(){
        Node temp=head;
        if(temp==null){
            System.out.println("Invalid action, LL is empty.");
            return null;
        }
        if(temp.next==null){
            System.out.println("Only one node is present that is deleted, now LL is empty.");
            return null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    // Method to count total number of nodes
    public void nodecount() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        System.out.println("Total number of nodes = " + c);
    }

    // Method to print complete Linked List data
    public void printAll() {
        Node p = head;
        int pos = 1;
        while (p != null) {
            System.out.println("Node at position " + pos + " is " + p.data);
            pos++;
            p = p.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Singly_Linked_List llist = new Singly_Linked_List();
        llist.head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        llist.head.next = second;
//        second.next=third;
        llist.insert_last(2);
        llist.insert_last(3);
        llist.insert_last(4);
        llist.insert_last(5);
        llist.insert_front(69);
        llist.head = llist.insert_before_node_at_specific_position(50, 5);
        llist.head = llist.insert_at_specific_position(15, 2);
        llist.head = llist.insert_after_node_at_specific_position(60, 7);
        llist.head = llist.delete_first_node();
        llist.head = llist.delete_last_node();
        llist.printAll();
        llist.nodecount();
    }
}