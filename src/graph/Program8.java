package graph;

public class Program8 {

    final static int INF = 9999;

    public static void main(String[] args) {
        int[][] graph = {
                {0,3,INF,5},
                {2,0,INF,4},
                {INF,1,0,INF},
                {INF,INF,2,0}
        };
        int vertex = graph.length;

        floydWarshall(graph,vertex);
    }

    private static void floydWarshall(int[][] graph, int vertex) {
        for(int k=0;k<vertex;k++)
        {
            for(int i=0;i<vertex;i++)
            {
                for(int j=0;j<vertex;j++)
                {
                    if(graph[i][j]>graph[i][k]+graph[k][j])
                    {
                        graph[i][j]= graph[i][k]+graph[k][j];
                    }
                }
            }
        }

        for(int i=0;i<vertex;i++)
        {
            for(int j=0;j<vertex;j++)
            {
                System.out.print(graph[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
