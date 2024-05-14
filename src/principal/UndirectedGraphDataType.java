package principal;

/**
 *
 * @author espin
 */
public class UndirectedGraphDataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);

        System.out.println(g.toString());
        
        int numVertices = g.V();
        int numEdges = g.E();
        System.out.println("El grafo tiene " + numVertices + " vértices y " + numEdges + " aristas.");

        // Obtiene los vértices adyacentes al vértice 0
        Iterable<Integer> adjVertices = g.adj(0);
        System.out.print("Los vértices adyacentes al vértice 0 son: ");
        for (int v : adjVertices) {
            System.out.print(v + " ");
        }
        System.out.println();  
        
        // Calcula el grado del vértice 2
        int gradoVertice2 = GraphProcessing.degree(g, 2);
        System.out.println("El grado del vértice 2 es: " + gradoVertice2);

        // Calcula el grado máximo en el grafo
        int gradoMaximo = GraphProcessing.maxDegree(g);
        System.out.println("El grado máximo en el grafo es: " + gradoMaximo);

        // Calcula el grado promedio en el grafo
        double gradoPromedio = GraphProcessing.averageDegree(g);
        System.out.println("El grado promedio en el grafo es: " + gradoPromedio);

        // Calcula el número de bucles de autovuelta en el grafo
        int buclesAutovuelta = GraphProcessing.numberOfSelfLoops(g);
        System.out.println("El número de bucles de autovuelta en el grafo es: " + buclesAutovuelta);
        
    }
}
