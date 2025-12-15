package graph;

public class Program2 {

    int[][] adjMatrix;
    int numVertex;

    public Program2(int numVertex) {
        this.numVertex = numVertex;
        adjMatrix = new int[numVertex][numVertex];
    }

    void addEdge(int s, int d)
    {
        adjMatrix[s][d] = 1;
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
        Program2 p1 = new Program2(5);
        p1.addEdge(1,0);
        p1.addEdge(0,2);
        p1.addEdge(0,3);
        p1.addEdge(3,2);
        p1.addEdge(4,3);
        p1.printMatrix();

    }
}






