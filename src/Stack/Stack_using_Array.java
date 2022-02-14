package Stack;

import java.util.Scanner;

public class Stack_using_Array {
    int tos;
    int arr[];
    public Stack_using_Array(int data) {
        tos = -1;
        arr = new int[data];
    }
    public boolean isEmpty(){
        if(tos==-1)
            return true;
        return false;
    }
    public boolean isFull(){
        if(tos==arr.length-1)
            return true;
        return false;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Overflow");
        }
        System.out.println("pushed value is:- "+data);
        arr[++tos]=data;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        System.out.println("Popped value is:- "+arr[tos--]);
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        System.out.println("Value at tos is:-"+arr[tos]);
    }
    public void printAll(){
        System.out.print("All elements of stack are:- ");
        for (int i = tos; i > -1; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt();
        Stack_using_Array st= new Stack_using_Array(n);
        st.push(10);
        st.push(20);
        st.push(30);
        st.printAll();
        st.peek();
        st.pop();
        st.pop();
        st.push(40);
        st.printAll();
        st.peek();
    }
}
