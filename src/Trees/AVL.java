package Trees;

public class AVL {
    static class Node{
        int data;
        Node left,right;
        int balance,height;
    }
    public static Node LL(Node a){
        Node b=a.left;
        Node b_right=b.right;
        b.right=a;
        a.left=b_right;
        return a;
    }
    public static Node RR(Node a){
        Node b=a.left;
        Node b_right=b.right;
        b.right=a;
        a.left=b_right;
        return a;
    }
}
