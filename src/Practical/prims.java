package Practical;

import java.util.Scanner;

public class prims {
    public static void prims(int matrix[][]){
        int n=matrix.length;
        boolean visited[]=new boolean[n];
        int parent[]=new int[n];
        int weight[]=new int[n];
        parent[0]=-1;
        weight[0]=0;
        for(int i=1;i<n;i++)
            weight[i]=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int minvertex = findmin(visited, weight);
            visited[minvertex]=true;
            for (int j = 0; j < n; j++) {
                if (matrix[minvertex][j] != 0 && !visited[j]) {
                    if (weight[j] > matrix[minvertex][j]) {
                        weight[j] = matrix[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            if(i<parent[i])
                System.out.println(i+" "+parent[i]+" "+weight[i]);
            else
                System.out.println(parent[i]+" "+i+" "+weight[i]);
        }
    }
    private static int findmin(boolean visited[], int weight[]){
        int minvertex=-1;
        for(int i=0;i<visited.length;i++){
            if(!visited[i] && (minvertex==-1 || weight[i]<weight[minvertex]))
                minvertex=i;
        }
        return minvertex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int v=sc.nextInt();
        System.out.println("Enter number of edges");
        int e=sc.nextInt();
        int matrix[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int weight=sc.nextInt();
            matrix[v1][v2]=weight;
            matrix[v2][v1]=weight;
        }
        prims(matrix);
    }
}



 /* prims execution
    Enter the number of vertex
        5
        Enter the number of edges
        7
        0 1 4
        0 2 8
        1 2 2
        1 3 6
        2 3 3
        2 4 9
        3 4 5
 execute the loop from value 1  insted of zero
-1   0   0
        0   1   4
        1   2   2
        2   3   3
        3   4   5
 */