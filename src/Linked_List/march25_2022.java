package Linked_List;

public class march25_2022 {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void count(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        System.out.println("Total nodes :"+c);
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insert(int x){
        Node newnode=new Node(x);
        if(head==null)
            head=newnode;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newnode;
            //newnode.next=null;
        }
    }

    public void check(int x){
        int flag=0;
        Node temp=head;
        while(temp!=null){
            if (temp.data == x) {
                System.out.println("Found");
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if(flag==0) {
            System.out.println("Not found");
            insert(x);
        }
    }
    public static void main(String[] args) {
        march25_2022 obj=new march25_2022();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.count();
        obj.print();
        obj.check(30);
        obj.check(25);
        obj.count();
        obj.print();
    }
}
