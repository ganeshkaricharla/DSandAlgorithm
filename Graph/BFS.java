import java.util.*;
class BFS
{
    static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void printBFS(ArrayList<ArrayList<Integer>> graph,int vertices)
    {
        boolean[] visited = new boolean[vertices];
        for(int i = 0; i< vertices;i++)
        {
            visited[i] = false;
        }
        Queue<Integer> q = new LinkedList<>();
        int s = 0;
        visited[s] = true;
        q.add(s);

        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.print(u + " ");

            for(int v: graph.get(u))
            {
                if(!visited[v])
                {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
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

        printBFS(graph,vertices);

    }
}