package graph;

import java.util.ArrayDeque;

public class Program7 {
    int[][] adjMatrix;
    int numVertex;

    Program7(int vertex)
    {
        adjMatrix = new int[vertex][vertex];
        numVertex = vertex;
    }

    void addEdge(int s, int d, int w)
    {
        adjMatrix[s][d] = w;
        adjMatrix[d][s] = w;
    }

    public static void main(String[] args) {
        Program7 p1 = new Program7(6);
        p1.addEdge(0,1,2);
        p1.addEdge(0,2,4);
        p1.addEdge(1,2,1);
        p1.addEdge(1,3,7);
        p1.addEdge(2,4,3);
        p1.addEdge(4,3,2);
        p1.addEdge(4,5,5);
        p1.addEdge(3,5,1);

        p1.dijkstra(0);
    }

    private void dijkstra(int source) {
        boolean[] visited = new boolean[numVertex];
        int[] distance = new int[numVertex];

        for(int i=0;i<numVertex;i++)
        {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;

        for(int i=0;i<numVertex;i++)
        {
            int u = findMinDistance(distance,visited);
            visited[u] = true;
            for(int v=0;v<numVertex;v++)
            {
                if(!visited[v] && adjMatrix[u][v]!=0 &&
                distance[u]+adjMatrix[u][v] < distance[v])
                {
                    distance[v] = distance[u]+adjMatrix[u][v];
                }
            }
        }

        for(int i=0;i<numVertex;i++)
        {
            System.out.println(source+" : "+i+" - "+distance[i]);
        }
    }

    private int findMinDistance(int[] distance, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for(int i=0;i<numVertex;i++)
        {
            if(!visited[i] && distance[i]<minDistance )
            {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }


}
