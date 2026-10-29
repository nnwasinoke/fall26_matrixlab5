public class Lab_5_Nnamdi {
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.add_edges(0, 1);
        g.add_edges(0, 3);
        g.add_edges(1, 4);
        g.add_edges(0, 2);
        g.add_edges(2, 3);

        g.display_matrix();

        System.out.println();

        g.connectedness(0, 1);
        g.connectedness(1, 3);

        System.out.println();

        g.adjacent_nodes(0);
        g.adjacent_nodes(2);
    }
}