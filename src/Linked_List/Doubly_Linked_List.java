package Linked_List;

public class Doubly_Linked_List {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    // Method to insert node at head
    public void insert_at_head(int data){
        Node newnode= new Node(data);
        Node temp= head;
        if(temp==null){
            temp=newnode;
            temp.next=null;
            temp.prev=null;
        }
        newnode.prev=null;
        newnode.next=temp;
        temp.prev=newnode;
        head = newnode;
    }

    // Method to insert node at end
    public void insert_at_end(int data){
        Node newnode= new Node(data);
        Node temp= head;
        if(temp==null){
            temp=newnode;
            temp.next=null;
            temp.prev=null;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
        newnode.next=null;
    }

    // Method to print all nodes of DLL
    public void print(){
        Node temp= head;
        if(head==null)
            System.out.println("DLL is empty.");
        int c=1;
        while(temp!=null){
            System.out.println("Node at position "+ c++ +" is "+temp.data);
            temp=temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Doubly_Linked_List llist=new Doubly_Linked_List();
        llist.head= new Node(10);
        llist.insert_at_end(20);
        llist.insert_at_end(30);
        llist.insert_at_end(40);
        llist.insert_at_head(50);
        llist.print();
    }
}
