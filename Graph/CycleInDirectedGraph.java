import java.util.*;
class CycleInDirectedGraph
{
    static void hasCycle(ArrayList<ArrayList<Integer>> graph,int source,int[] visited,int[] isBackEdge)
    {
        visited[source] = true;
        isBackEdge[source] = true;
        for(int u : graph.get(source))
        {
            if(visited[u] == false && hasCycle(graph,u,visited,isBackEdge))
            {
                return true;
            }
            else if(isBackEdge[u] == true)
            {
                return true;
            }
        }
        isBackEdge[source] = false;
        return false;
    }
    static boolean DFS(ArrayList<ArrayList<Integer>> graph,int vertices)
    {
        boolean visited = new boolean[vertices];
        boolean isBackEdge = new boolean[vertices];
        for(int i =0; i< vertices;i++)
        {
            if(!visited[i])
            {
                if(hasCycle(graph,i,visited,isBackEdge)) return true; 
            }
        }
        return false;       
    }
    static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
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

        DFS(graph,vertices);

    }
}