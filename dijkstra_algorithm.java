package CBCLASS;

import java.util.*;

public class dijkstra_algorithm {
    // dijkstra algorithm using 1st method
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public void Dijkstra_Algorithm(int v) {
        // TODO Auto-generated constructor stub
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());

        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void dijkstra(int src) { // Min-heap based on cost
        PriorityQueue<dijkstrapair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new dijkstrapair(src, " " + src, 0));
        while (!pq.isEmpty()) {
            dijkstrapair rp = pq.poll();

            if (visited.contains(rp.vtx))
                continue;

            visited.add(rp.vtx);

            System.out.println(rp.vtx);
            System.out.println(rp);

            for (int nbr : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbr)) {
                    pq.add(new dijkstrapair(nbr, rp.acqVtx + nbr, rp.cost + cost));
                }
            }
        }

    }

    public static void main(String[] args) {
        Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
        dj.AddEdge(1, 2, 2);
        dj.AddEdge(2, 3, 3);
        dj.AddEdge(1, 4, 10);
        dj.AddEdge(4, 5, 8);
        dj.AddEdge(3, 4, 1);
        dj.AddEdge(5, 6, 5);
        dj.AddEdge(5, 7, 6);
        dj.AddEdge(6, 7, 4);
        dj.Dijkstra(1);
    }

    class dijkstrapair {
        int vtx;
        int acqVtx;
        int cost;

    PrimPair(int vtx, int acqVtx, int cost) {
        this.vtx = vtx;
        this.acqVtx = acqVtx;
        this.cost = cost;

    }

        @Override
        public String toString() {
            return vtx + " " + acqVtx + " @ " + cost;
        }
    }
}