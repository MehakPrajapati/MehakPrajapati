package CBCLASS;

import java.util.*;

// Prim's Algorithm to find Minimum Spanning Tree weight
public class PrimsAlgo {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public PrimsAlgo(int v) {
        // initialise adjacency map
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public int primsAlgo() {
        // Min-heap based on cost
        PriorityQueue<PrimPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        HashSet<Integer> visited = new HashSet<>();

        // start from vertex 1
        pq.add(new PrimPair(1, -1, 0));
        int sum = 0;

        while (!pq.isEmpty()) {
            PrimPair rp = pq.poll();

            if (visited.contains(rp.vtx))
                continue;

            visited.add(rp.vtx);
            sum += rp.cost;

            System.out.println(" " + rp.acqVtx + " " + rp.vtx + " " + rp.cost);

            for (int nbr : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbr)) {
                    pq.add(new PrimPair(nbr, rp.vtx, map.get(rp.vtx).get(nbr)));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        PrimsAlgo g = new PrimsAlgo(7);
        g.addEdge(1, 2, 5);
        g.addEdge(1, 4, 2);
        g.addEdge(3, 2, 3);
        g.addEdge(3, 4, 1);
        g.addEdge(5, 4, 6);
        g.addEdge(5, 6, 2);
        g.addEdge(5, 7, 4);
        g.addEdge(7, 6, 8);

        System.out.println(g.primsAlgo());
    }
}

class PrimPair {
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
