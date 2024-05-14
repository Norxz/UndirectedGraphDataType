
package principal;

/**
 *
 * @author espin
 */
public class GraphProcessing {

    public static int degree(Graph G, int v) {
        int degree = 0;
        for (int w : G.adj(v)) {
            degree++;
        }
        return degree;
    }
    
    public static int maxDegree(Graph G) {
        int max = 0;
        for (int v = 0; v < G.V(); v++)
            if (degree(G, v) > max)
                 max = degree(G, v);
        return max;
    }
    
    public static double averageDegree(Graph G) {
        return 2.0 * G.E() / G.V();
    }
    
    public static int numberOfSelfLoops(Graph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++)
            for (int w : G.adj(v))
                if (v == w) count++;
        return count / 2; // cada arista contada dos veces
    }

    // Representación en cadena de las listas de adyacencia del grafo
    public static String adjacencyListsToString(Graph G) {
        StringBuilder s = new StringBuilder();
        s.append(G.V()).append(" vértices, ").append(G.E()).append(" aristas\n");
        for (int v = 0; v < G.V(); v++) {
            s.append(v).append(": ");
            for (int w : G.adj(v))
                s.append(w).append(" ");
            s.append("\n");
        }
        return s.toString();
    }
    
}
