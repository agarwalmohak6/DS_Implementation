package Queue;

public class Queue_using_Linked_List {
    Node front, rear;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    // Method to check if queue is empty
    public boolean isempty() {
        if (front == null)
            return true;
        return false;
    }
    // Method to insert in queue
    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (isempty()) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }
    // Method to delete from queue
    public void dequeue() {
        if (isempty())
            System.out.println("Underflow");
        else if (front != null) {
            System.out.println(front.data);
            front = front.next;
        }
    }
    // Main method
    public static void main(String[] args) {
        Queue_using_Linked_List obj=new Queue_using_Linked_List();
        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.dequeue();
        obj.enqueue(40);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
    }
}
