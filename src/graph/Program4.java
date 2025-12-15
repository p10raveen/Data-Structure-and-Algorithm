package graph;

import java.util.ArrayDeque;
import java.util.Stack;

public class Program4 {
    int[][] adjMatrix;
    int numVertex;
    boolean[] visited;

    Program4(int vertex)
    {
        adjMatrix = new int[vertex][vertex];
        visited = new boolean[vertex];
        numVertex = vertex;
    }

    void addEdge(int s, int d)
    {
        adjMatrix[s][d] = 1;
        adjMatrix[d][s] = 1;
    }

    public static void main(String[] args) {
        Program4 p1 = new Program4(5);
        p1.addEdge(0,1);
        p1.addEdge(0,2);
        p1.addEdge(2,4);
        p1.addEdge(1,3);
        p1.addEdge(1,4);
        p1.bfs(0);
    }

    private void bfs(int startVertex) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while(!queue.isEmpty())
        {
            int vertex = queue.poll();
            System.out.print(vertex+"\t");

            for(int i=0;i<numVertex;i++)
            {
                if(adjMatrix[vertex][i]==1 && !visited[i])
                {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

}
