package graph;

import java.util.ArrayList;

public class Program6 {
    int[][] adjMatrix;
    int numVertex;

    Program6(int vertex)
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
        Program6 p1 = new Program6(5);
        p1.addEdge(0,2,3);
        p1.addEdge(2,1,10);
        p1.addEdge(2,3,2);
        p1.addEdge(2,4,6);
        p1.addEdge(1,3,4);
        p1.addEdge(3,4,1);
        p1.kruskal();
    }

    void kruskal()
    {
        ArrayList<int[]> result = new ArrayList<>();
        int[] parent = new int[numVertex];
        int[] temp = new int[numVertex];
        for(int i=0;i<numVertex;i++)
        {
            parent[i] = i;
        }

        while(result.size()< numVertex-1)
        {
            int minWeigth = 1000;
            int sourceIndex = -1;
            int destIndex = -1;

            for(int i=0;i<numVertex;i++)
            {
                for(int j=0;j<numVertex;j++)
                {
                    if(adjMatrix[i][j]!=0)
                    {
                        int root1 = find(parent,i);
                        int root2 = find(parent,j);

                        if(root1!=root2 && adjMatrix[i][j] < minWeigth)
                        {
                            minWeigth = adjMatrix[i][j];
                            sourceIndex = i;
                            destIndex = j;
                        }
                    }
                }
            }

            if(sourceIndex!=-1 && destIndex!=-1)
            {
                result.add(new int[]{sourceIndex,destIndex});
                union(parent,temp,sourceIndex,destIndex);
            }
        }
        for(int[] edge : result)
        {
            System.out.println(edge[0]+" : "+edge[1]+" - "+adjMatrix[edge[0]][edge[1]]);
        }
    }

    void union(int[] parent, int[] temp,int x, int y) // x=1,y=3
    {
        int xRoot =find(parent,x); // xRoot = 1
        int yRoot =find(parent,y); // yRoot = 3

        if(temp[xRoot] < temp[yRoot])
        {
            parent[xRoot] = yRoot;
        }
        else if( temp[xRoot] > temp[yRoot])
        {
            parent[yRoot] = xRoot;
        }
        else
        {
            parent[yRoot] = xRoot;
        }
        temp[xRoot]++;
    }

    int find(int[] parent , int i)
    {
        if(parent[i]==i)
        return i;

        return find(parent,parent[i]);
    }
}
