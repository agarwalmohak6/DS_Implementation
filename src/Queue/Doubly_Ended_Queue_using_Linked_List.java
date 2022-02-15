package Queue;

public class Doubly_Ended_Queue_using_Linked_List {
    Node front,rear;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public boolean isEmpty(){
        if(front==null || rear==null)
            return true;
        return false;
    }
    public void enqueue_front(int data){
        Node newnode=new Node(data);
        if(isEmpty())
            front=rear=newnode;
        else{
            newnode.next=front;
            front=newnode;
        }
    }
    public void enqueue_rear(int data){
        Node newnode=new Node(data);
        if(isEmpty())
            front=rear=newnode;
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }
    public void dequeue_front(){
        if(isEmpty())
            System.out.println("Underflow");
        else if(front==rear) {
            System.out.println(front.data);
            front = rear = null;
        }
        else {
            System.out.println(front.data);
            front = front.next;
        }
    }
    public void dequeue_rear(){
        if(isEmpty())
            System.out.println("Underflow");
        else if(front==rear){
            System.out.println(front.data);
            front=rear=null;
        }
        else {
            Node temp=front;
            while(temp.next.next!=null)
                temp=temp.next;
            System.out.println(temp.next.data);
            temp.next=null;
            rear=temp;
        }
    }
    public static void main(String[] args) {
        Doubly_Ended_Queue_using_Linked_List obj=new Doubly_Ended_Queue_using_Linked_List();
        obj.dequeue_rear();
        obj.enqueue_front(10);
        obj.enqueue_rear(20);
        obj.enqueue_rear(30);
        obj.enqueue_front(40);
        obj.dequeue_rear();
        obj.dequeue_rear();
        obj.dequeue_front();
        obj.dequeue_front();
        obj.dequeue_front();
    }
}
