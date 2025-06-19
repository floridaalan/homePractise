public class GraphMatrix {
    private int vertices;
    private int[][] adjMatrix;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    // Add edge (undirected)
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;  // Remove this line for directed graph
    }

    public void DFS_Using_Stack(int start) {
    boolean[] visited = new boolean[vertices];       
    int[] stack = new int[vertices];                 
    int top = -1;                                     

    stack[++top] = start;                             

    while (top >= 0) {                                
        int current = stack[top--];                 

        if (!visited[current]) {
            visited[current] = true;               
            System.out.print(current + " ");          
        }

        for (int i = vertices - 1; i >= 0; i--) {
            if (adjMatrix[current][i] == 1 && !visited[i]) {
                stack[++top] = i;                    
            }
        }
    }
}


    public void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        int[] queue = new int[vertices];
        int front = 0, rear = 0;

        visited[start] = true;
        queue[rear++] = start;

        System.out.print("BFS starting from vertex " + start + ": ");

        while (front < rear) {
            int current = queue[front++];
            System.out.print(current + " ");

            for (int i = 0; i < vertices; i++) {
                if (adjMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }

        System.out.println();
    }

    // Print the adjacency matrix
    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printMatrix();

        graph.DFS_Using_Stack(0);
        graph.BFS(0);
    }
}
// Output:
// Adjacency Matrix:
