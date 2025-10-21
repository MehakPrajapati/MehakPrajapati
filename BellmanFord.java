package CBCLASS;

import java.util.*;

public class BellmanFord {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public BellmanFord(int v) {
        // initialise adjacency list
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost); // directed edge
    }

    /** Collect all edges with their weights */
    private List<EdgePair> getEdges() {
        List<EdgePair> edges = new ArrayList<>();
        for (int u : map.keySet()) {
            for (int v : map.get(u).keySet()) {
                edges.add(new EdgePair(u, v, map.get(u).get(v)));
            }
        }
        return edges;
    }

    public void bellmanFord(int src) {
        int V = map.size();
        int[] dist = new int[V + 1];
        for (int i = 2; i < dist.length; i++) {
            dist[src] = 0;
        }

        List<EdgePair> edges = getEdges();

        for (int i = 1; i <= V - 1; i++) {
            for (EdgePair e : edges) {
                if (dist[e.u] != Integer.MAX_VALUE &&
                        dist[e.u] + e.cost < dist[e.v]) {
                    dist[e.v] = dist[e.u] + e.cost;
                }
            }
        }
        for (EdgePair e : edges) {
            if (dist[e.u] != Integer.MAX_VALUE &&
                    dist[e.u] + e.cost < dist[e.v]) {
                System.out.println("-ve weightt to cycle h");
                return;
            }
        }

        // print distances
        for (int i = 1; i <= V; i++) {
            System.out.println("Distance from " + src + " to " + i + " : "
                    + (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]));
        }
    }

    // helper class for edges
    static class EdgePair {
        int u, v, cost;

        EdgePair(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        BellmanFord g = new BellmanFord(5);
        g.addEdge(1, 2, 4);
        g.addEdge(1, 3, 5);
        g.addEdge(2, 3, -3);
        g.addEdge(2, 4, 6);
        g.addEdge(3, 4, 1);
        g.addEdge(4, 5, 2);

        g.bellmanFord(1);
    }
}
