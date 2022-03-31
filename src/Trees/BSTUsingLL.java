package Trees;

public class BSTUsingLL {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        Node newnode=new Node(val);
        if(root==null){
            root=newnode;
            return root;
        }
        if(root.data>val){
            if(root.left==null)
                root.left=newnode;
            else {
                insert(root.left,val);
            }
        }
        if(root.data<val){
            if(root.right==null)
                root.right=newnode;
            else
                insert(root.right,val);
        }
        return root;
    }
    public void printpreorder(Node root){
        Node r1=root;
        if(r1!=null){
            System.out.println(r1.data);
            printpreorder(r1.left);
            printpreorder(r1.right);
        }
    }
    public static boolean search(Node root,int value){
        boolean result;
        if(root==null)
            return false;
        if(root.data==value)
            return true;
        if(root.data>value)
            result=search(root.left,value);
        else
            result=search(root.right,value);
        return result;
    }
    public static void main(String[] args) {
        BSTUsingLL obj=new BSTUsingLL();
        root=new Node(15);
        root.left=new Node(10);
        root.left.left=new Node(8);
        root.right=new Node(20);
        obj.insert(root.left,12);
        obj.printpreorder(root);
        System.out.println(obj.search(root,8));
        System.out.println(obj.search(root,80));
    }
}
