package Queue;

public class Priority_Queue {
    Node front;
    Node rear;

    public Priority_Queue() {
        front = null;
        rear = null;

    }

    public static void main(String[] args) {
        // Creation of the node class object
        Node n1 = new Node(15, 4);
        Node n2 = new Node(10, 3);
        Node n3 = new Node(20, 3);
        Node n5 = new Node(55,2);
        Node n4= new Node(50,5);
        Priority_Queue obj = new Priority_Queue();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n5);
        obj.enqueue(n4);
        obj.display();
    }

    public void enqueue(Node newnode) {
        if (front == null || newnode.priority < front.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            Node temp = front;

            while (temp.next != null && temp.next.priority <= newnode.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + " " + temp.priority);
            temp = temp.next;
        }
    }

    static class Node {
        Node next;
        int data;
        int priority;

        public Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }
}