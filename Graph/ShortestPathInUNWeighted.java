import java.util.*;
class ShortestPathInUNWeighted
{
    static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void ShortestPath(ArrayList<ArrayList<Integer>> graph,int vertices,int source) 
    {
        int[] dist =  new int[vertices];
        for(int i = 0;i < vertices;i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        boolean[] visited = new boolean[vertices];
        visited[source] = true;
        dist[source] =0;
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(source);
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int v : graph.get(u))
            {
               if(!visited[v])
               {
                    dist[v] = dist[u] +1;
                    visited[v] = true;
                    q.offer(v);
               }
            }
        }
        for(int i: dist)
        {
            System.out.print(i + " ");
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


        int source = 0;
       ShortestPath(graph,vertices,source);

    }
}