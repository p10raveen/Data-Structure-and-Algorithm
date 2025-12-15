package graph;

import java.util.Stack;

public class Program3 {
    int[][] adjMatrix;
    int numVertex;
    boolean[] visited;

    Program3(int vertex)
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
        Program3 p1 = new Program3(5);
        p1.addEdge(0,1);
        p1.addEdge(0,2);
        p1.addEdge(2,4);
        p1.addEdge(1,3);
        p1.addEdge(1,4);
        p1.dfs(0);
    }

    private void dfs(int startVertex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while(!stack.isEmpty())
        {
            int vertex = stack.pop(); // 0

            if(!visited[vertex])
            {
                visited[vertex] = true;
                System.out.print(vertex+"\t");
            }
            for(int i=0;i<numVertex;i++)
            {
                if(adjMatrix[vertex][i]==1 && !visited[i])
                {
                    stack.push(i);
                }
            }
        }
    }

}
