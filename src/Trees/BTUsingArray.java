package Trees;

public class BTUsingArray {
    int arr[];
    int lastusedindex;
    public BTUsingArray(int size){
        arr=new int[size+1];
        lastusedindex=0;
    }
    public void insert(int value){
        if(lastusedindex>arr.length-1)
            return;
        arr[++lastusedindex]=value;
    }
    public void preorder(int index){
        if(index>lastusedindex)
            return;
        System.out.println(arr[index]);
        preorder(2*index);
        preorder(2*index+1);
    }
    public int search(int value){
        for(int i=1;i<lastusedindex;i++){
            if(arr[i]==value) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    public void delete(int value){
        int res=search(value);
        arr[res]=arr[lastusedindex];
        lastusedindex--;
    }

    public static void main(String[] args) {
        BTUsingArray obj=new BTUsingArray(5);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.preorder(1);
        obj.search(25);
        obj.search(30);
        obj.delete(40);
        obj.preorder(1);
    }
}
