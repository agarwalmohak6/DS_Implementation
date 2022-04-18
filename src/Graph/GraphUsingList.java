package Graph;
import java.util.*;

public class GraphUsingList {
    Map<Integer, LinkedList<Integer>> obj;
    public GraphUsingList(){
        obj=new HashMap<>();
    }
    public void add_edge(int v1, int v2, boolean bidirectional){
        LinkedList<Integer> v1neighbours=obj.getOrDefault(v1,new LinkedList<>());
        v1neighbours.add(v2);
        obj.put(v1,v1neighbours);
        if(bidirectional){
            LinkedList<Integer> v2neighbours=obj.getOrDefault(v2,new LinkedList<>());
            v2neighbours.add(v1);
            obj.put(v2,v2neighbours);
        }
    }
    public static void main(String[] args){
        GraphUsingList g=new GraphUsingList();
        g.add_edge(1,2,true);
        g.add_edge(2,3,false);
        g.add_edge(3,4,true);
        for(Map.Entry<Integer, LinkedList<Integer>> res:g.obj.entrySet()){
            System.out.print(res.getKey()+": ");
            System.out.println(res.getValue());
        }
    }
}