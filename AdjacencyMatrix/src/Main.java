
public class Main {
    public static void main(String[] args) {
        //  Adjacency Matrix = An 2D array to store 1's/0's to represent edges
        //  # of rows = # of unique nodes
        //  # of columns = # of unique nodes

        //  runtime complexity to check an edge = O(1)
        //  space complexity = O(n^2)

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 0);
        graph.print();

        System.out.println(graph.checkEdge(0, 1));
    }
}