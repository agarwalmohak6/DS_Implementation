package Queue;

public class Queue_using_Array {
    int front,rear;
    int arr[];
    public Queue_using_Array(int size) {
        front=rear=-1;
        arr=new int[size];
    }
    // Method to check if queue is empty
    public boolean isEmpty(){
        if(front==-1)
            return true;
        return false;
    }
    // Method to check if queue if full
    public boolean isFull(){
        if(rear==arr.length-1)
            return true;
        return false;
    }
    // Method to insert in queue
    public void enqueue(int data){
        if(isFull())
            System.out.println("Overflow");
        else if(isEmpty()){
            front=0;
            rear=0;
            arr[rear]=data;
        }
        else{
            arr[++rear]=data;
        }
    }
    // Method to delete from queue
    public void dequeue(){
        if(isEmpty())
            System.out.println("Underflow");
        else{
            System.out.println(arr[front++]);
        }
        if(front>rear)
            front=rear=-1;
    }
    // Main method
    public static void main(String[] args) {
        Queue_using_Array obj=new Queue_using_Array(2);
        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(30);
    }
}
