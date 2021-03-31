import java.util.*;
class DFS
{
    static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void DFShelper(ArrayList<ArrayList<Integer>> graph,int s,boolean[] visited)
    {
        visited[s] = true;
        System.out.print(s + " ");
        for(int u : graph.get(s))
        {
            if(!visited)
            {
                DFShelper(graph,u,visited);
            }
        }        
    } 
    static void printDFS(ArrayList<ArrayList<Integer>> graph,int vertices)
    {
        boolean visited = new boolean[vertices];
        DFShelper(graph,0,visited); 
    }
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(vertices);

        for(int i = 0; i< vertices;i++)
        {
            graph.add(new ArrayList<Integer>());
        }

        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,2);
        addEdge(graph,2,3);
        addEdge(graph,1,3);
        addEdge(graph,3,4);
        addEdge(graph,2,4);

        printDFS(graph,vertices);

    }
}