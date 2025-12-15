package graph;

public class Program1 {

    int[][] adjMatrix;
    int numVertex;

    public Program1(int numVertex) {
        this.numVertex = numVertex;
        adjMatrix = new int[numVertex][numVertex];
    }

    void addEdge(int s, int d)
    {
        adjMatrix[s][d] = 1;
        adjMatrix[d][s] = 1;
    }

    void printMatrix()
    {
        for(int i=0;i<numVertex;i++)
        {
            for (int j=0;j<numVertex;j++)
            {
                System.out.print(adjMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Program1 p1 = new Program1(5);
        p1.addEdge(0,1);
        p1.addEdge(0,3);
        p1.addEdge(0,2);
        p1.addEdge(2,3);
        p1.addEdge(2,4);
        p1.printMatrix();

    }
}






