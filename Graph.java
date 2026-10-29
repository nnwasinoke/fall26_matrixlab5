public class Graph {
    private int vertices;
    private int[][] adjacency_mat;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency_mat = new int[vertices][vertices];
    }

    public void add_edges(int from, int to) {
        adjacency_mat[from][to] = 1;
        adjacency_mat[to][from] = 1;
    }

    public void display_matrix() {
        for (int i = 0; i < adjacency_mat.length; i++) {
            for (int j = 0; j < adjacency_mat[i].length; j++) {
                System.out.print(adjacency_mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check if two vertices have an edge
    public void connectedness(int from, int to) {
        if (adjacency_mat[from][to] == 1) {
            System.out.println(from + " and " + to + " are connected.");
        } else {
            System.out.println(from + " and " + to + " are not connected.");
        }
    }

    // Display all adjacent vertices
    public void adjacent_nodes(int vertex) {
        System.out.print("Adjacent nodes of " + vertex + ": ");

        for (int i = 0; i < adjacency_mat[vertex].length; i++) {
            if (adjacency_mat[vertex][i] == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}