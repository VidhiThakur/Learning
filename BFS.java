public class BFS {
    public void performBFS()
    {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);

        System.out.println("The Breadth First Traversal of the graph is as follows :");

        graph.BFS(0);
    }
}
