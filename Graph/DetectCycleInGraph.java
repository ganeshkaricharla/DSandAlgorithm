import java.util.*;
class DFS
{
    static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static boolean haveCycle(ArrayList<ArrayList<Integer>> graph,int source,int[] visited,int parent)
    {
        visited[source] = true;
        for(int u: source)
        {
            if(visited[u] == false)
            {
                if(haveCycle(graph,u,visited,source))
                {
                    return true;
                }
                else if(u != parent)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean DFS(ArrayList<ArrayList<Integer>> graph,int vertices)
    {
        boolean visited = new boolean[v];
        for(int i = 0;i< vertices;i++)
        {
            if(!visited[i])
            {
                if(haveCycle(graph,i,visited,-1))
                {
                    return true;
                }
            }
        }
        return false;
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

        System.out.print(DFS(graph,vertices));

    }
}