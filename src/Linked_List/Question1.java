package Linked_List;

public class Question1 {
    Node head;
    static class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            next=null;
        }
    }
    public void insert(String data){
        Node newnode= new Node(data);
        Node temp= head;
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
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        String ans[]=new String[args.length];
        for(int i=0;i< args.length;i++) {
            int n = Integer.parseInt(args[i]);
            String res = "";
            if (n > 0)
                res += 'p';
            else if (n < 0)
                res += 'n';
            String num = "" + n;
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '0')
                    res += 'z';
                else if(!(num.charAt(j)>='0' && num.charAt(j)<='9'))
                    res+="";
                else if (Character.getNumericValue(num.charAt(j)) % 2 != 0)
                    res += 'o';
                else if (Character.getNumericValue(num.charAt(j)) % 2 == 0)
                    res += 'e';
            }
            ans[i] = res;
        }
        Question1 llist= new Question1();
        llist.head= new Node(ans[0]);
        for(int i=1;i< ans.length;i++)
            llist.insert(ans[i]);
        llist.print();
    }
}
