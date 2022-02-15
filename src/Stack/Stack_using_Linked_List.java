package Stack;

public class Stack_using_Linked_List {
    Node head;
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to check if stack is empty
    public boolean isempty() {
        return head == null;
    }

    // Method to push data at top of stack
    public void push(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
        System.out.println("Data pushed " + x);
    }

    // Method to pop top of stack element
    public void pop() {
        if (isempty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Poped Elemet is -> " + head.data);
            head = head.next;
        }
    }

    // Method to print top of stack
    public void peek() {
        System.out.println("Peek Element is -> " + head.data);
    }
    // Method to print stack data
    public void printall() {
        if (isempty()) {
            System.out.println("Stack is Empty");
        } else {
            Node n = head;
            System.out.println("Printing stack");
            while (n != null) {
                System.out.println(n.data + " ");
                n = n.next;
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        Stack_using_Linked_List llist = new Stack_using_Linked_List();
        llist.push(10);
        llist.push(20);
        llist.push(30);
        llist.push(40);
        llist.printall();
        llist.pop();
        llist.pop();
        llist.printall();
        llist.printall();
        llist.push(69);
        llist.peek();
        llist.pop();
        llist.pop();
        llist.pop();
        llist.pop();
    }
}
