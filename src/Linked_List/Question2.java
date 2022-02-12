package Linked_List;
import java.util.Scanner;

public class Question2 {
    Node head;
    int tos;
    int stack[];

    // Node structure for LL
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    // Stack constructor
    Question2(int data){
        tos=-1;
        stack= new int[data];
    }

    // Method to check if stack is empty
    public boolean isEmpty(){
        return tos==-1;
    }

    // Method to check if stack is full
    public boolean isFull(){
        return tos==stack.length-1;
    }

    // Method to add in stack
    public void push(int data){
        if(isFull())
            System.out.println("Overflow");
        else
            stack[++tos]=data;
    }

    // Method to pop from stack
    public void pop(){
        if(isEmpty())
            System.out.println("Underflow");
        else
            System.out.print(stack[tos--] +" ");
    }

    // Method to insert in Linked List
    public void insert(int data){
        Question2.Node newnode= new Question2.Node(data);
        Question2.Node temp= head;
        if(temp==null){
            temp=newnode;
            newnode.next=null;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
    }
//
//    // Method to print LL
//    public void printAll() {
//        Node p = head;
//        int pos = 1;
//        while (p != null) {
//            System.out.println("Node at position " + pos + " is " + p.data);
//            pos++;
//            p = p.next;
//        }
//    }

    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans[]=new int[c];
        for(int i=0;i<r;i++){
            int s=0;
            for(int j=0;j<c;j++){
                s+=arr[j][i];
            }
            ans[i]=s;
        }
        Question2 llist= new Question2(c);
        llist.head= new Node(ans[0]);
        for(int i=1;i<c;i++)
            llist.insert(ans[i]);
        while(llist.head!=null){
            llist.push(llist.head.data);
            llist.head=llist.head.next;
        }
        int count=0;
        while(count<c) {
            llist.pop();
            count++;
        }
    }
}