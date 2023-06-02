public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();
//        MyGraph<String> graph = new MyGraph<>();

        graph.addVertex("Almaty");
        graph.addVertex("Astana");
        graph.addVertex("Shymkent");
        graph.addVertex("Kostanay");
        graph.addVertex("Kyzylorda");

        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);

//        graph.addEdge("Almaty", "Astana");
//        graph.addEdge("Almaty", "Shymkent");
//        graph.addEdge("Shymkent", "Astana");
//        graph.addEdge("Astana", "Kostanay");
//        graph.addEdge("Shymkent", "Kyzylorda");

        System.out.println("Dijkstra:");
//        Search<String> djk = new DijkstraSearch<>(graph, "Almaty");
//        outputPath(djk, "Kyzylorda");
        Dijkstra<String> dijkstra = new Dijkstra<>(graph, "Almaty", "Kyzylorda");
        outputPath(dijkstra.getRoad());


//        System.out.println("DFS:");
////        Search<String> dfs = new DepthFirstSearch<>(graph, "Almaty");
//        outputPath(graph.DFS("Almaty", "Kyzylorda"));
//
//        System.out.println("\n--------------------------------");
//
//        System.out.println("BFS:");
////        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
//        outputPath(graph.BFS("Almaty", "Kyzylorda"));
    }

    public static void outputPath(Iterable<String> road) {
        for (String v : road) {
            System.out.print(v + " -> ");
        }
    }
}