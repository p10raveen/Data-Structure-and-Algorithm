package graph;

import java.util.ArrayDeque;

public class Program5 {
    int[][] adjMatrix;
    int numVertex;

    Program5(int vertex)
    {
        adjMatrix = new int[vertex][vertex];
        numVertex = vertex;
    }

    void addEdge(int s, int d,int w)
    {
        adjMatrix[s][d] = w;
        adjMatrix[d][s] = w;
    }

    public static void main(String[] args) {
        Program5 p1 = new Program5(5);
        p1.addEdge(0,2,3);
        p1.addEdge(2,1,10);
        p1.addEdge(2,3,2);
        p1.addEdge(2,4,6);
        p1.addEdge(1,3,4);
        p1.addEdge(3,4,1);
        p1.prims(0);
    }

    private void prims(int startVertex) {
        int noEdge = 0;
        boolean[] selected = new boolean[numVertex];
        selected[startVertex] = true;

        while(noEdge<numVertex-1)
        {
            int min = Integer.MAX_VALUE;
            int x = 0;
            int y = 0;

            for (int i=0;i<numVertex;i++)
            {
                if(selected[i])
                {
                    for(int j=0;j<numVertex;j++)
                    {
                        if(!selected[j] && adjMatrix[i][j]!=0)
                        {
                            if(min>adjMatrix[i][j])
                            {
                                min = adjMatrix[i][j];
                                x=i;
                                y=j;
                            }
                        }
                    }
                }
            }
            System.out.println(x+"-->"+y+" : "+adjMatrix[x][y]);
            selected[y] = true;
            noEdge++;
        }

    }

}
