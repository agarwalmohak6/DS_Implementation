package Graph;
import java.util.*;

public class GraphUsingList {
    Map<Integer, ArrayList<Integer>> obj=new HashMap<>();
    public void add_edge(int v1, int v2, boolean bidirectional){
        ArrayList<Integer> v1neighbours=obj.getOrDefault(v1,new ArrayList<>());
        v1neighbours.add(v2);
        obj.put(v1,v1neighbours);
        if(bidirectional){
            ArrayList<Integer> v2neighbours=obj.getOrDefault(v2,new ArrayList<>());
            v2neighbours.add(v1);
            obj.put(v2,v2neighbours);
        }
    }
    public void BFSTraversal(int source){
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        Set<Integer> visited=new HashSet<>();
        visited.add(source);
        while(!q.isEmpty()){
            int front=q.poll();
            System.out.print(front+" ");
            List<Integer> neighbour=obj.get(front);
            for(int res:neighbour){
                if(!visited.contains(res)){
                    q.add(res);
                    visited.add(res);
                }
            }
        }
    }
    public static void main(String[] args){
        GraphUsingList g=new GraphUsingList();
        g.add_edge(1,2,true);
        g.add_edge(2,3,false);
        g.add_edge(3,4,true);
        for(Map.Entry<Integer, ArrayList<Integer>> res:g.obj.entrySet()){
            System.out.print(res.getKey()+": ");
            System.out.println(res.getValue());
        }
        System.out.println("Various roots BFS Traversals are:-");
        g.BFSTraversal(1);
        System.out.println();
        g.BFSTraversal(2);
        System.out.println();
        g.BFSTraversal(3);
        System.out.println();
        g.BFSTraversal(4);
    }
}