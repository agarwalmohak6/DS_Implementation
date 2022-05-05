package Trees;
import java.util.ArrayList;
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
    static ArrayList<Integer> al=new ArrayList<>();
    public static void inorder(Node root){
        Node r=root;
        if(r!=null){
            inorder(r.left);
            al.add(r.data);
            System.out.print(r.data+" ");
            inorder(r.right);
        }
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
    public static boolean isBST(Node root)
    {
        inorder(root);
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1))
                return false;
        }
        if(al.get(al.size()-1)<al.get(al.size()-2))
            return false;
        return true;
    }
    public static int min(Node root){
        if(root.left==null)
            return root.data;
        return min(root.left);
    }
    public static int max(Node root){
        while(root.right!=null)
            root=root.right;
        return root.data;
    }
    public static Node delete(Node root, int k){
        if(root==null)
        {
            return null;
        }
        if(root.data>k)
        {
            root.left= delete(root.left,k);
        }
        else if(root.data<k)
        {
            root.right=delete(root.right,k);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            root.data=min(root.right);
            root.right=delete(root.right,root.data);
        }
        return root;
    }
    public static void main(String[] args) {
        BSTUsingLL obj=new BSTUsingLL();
        root=insert(root,15);
        root=insert(root,10);
        root=insert(root,8);
        root=insert(root,12);
        root=insert(root,20);
        root=insert(root,18);
        root=insert(root,16);
        root=insert(root,19);
        root=insert(root,30);
        obj.inorder(root);
//        System.out.println(obj.search(root,8));
//        System.out.println(obj.search(root,80));
//        System.out.println(isBST(root));
        //System.out.println(min(root));
        //System.out.println(max(root));
        System.out.println();
//        System.out.print(getSuccessor(root).data);
        //System.out.println();
        //System.out.print(min(root));
        root=delete(root,19);
        root=delete(root,15);
        inorder(root);
    }
}
