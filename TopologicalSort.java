import java.util.*;

public class TopologicalSort {
    private HashMap<Integer, List<Integer>> map;

    public TopologicalSort(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int v1, int v2) {
        map.get(v1).add(v2); // directed edge
    }

    /** Calculate indegree of all vertices */
    private int[] indegree() {
        int[] in = new int[map.size()];
        for (int u : map.keySet()) {
            for (int nbr : map.get(u)) {
                in[nbr]++;
            }
        }
        return in;
    }

    /** Kahn’s Algorithm: print topological order */
    public void topoSort() {
        int[] in = indegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0)
                q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int nbr : map.get(node)) {
                in[nbr]--;
                if (in[nbr] == 0)
                    q.add(nbr);
            }
        }
        System.out.println();
    }

    /** Return true if cycle exists */
    public boolean hasCycle() {
        int[] in = indegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0)
                q.add(i);
        }

        int visited = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            visited++;
            for (int nbr : map.get(node)) {
                in[nbr]--;
                if (in[nbr] == 0)
                    q.add(nbr);
            }
        }
        // If all vertices are not visited, graph has a cycle
        return visited != map.size();
    }

    public static void main(String[] args) {
        TopologicalSort ts = new TopologicalSort(8);
        ts.addEdge(1, 2);
        ts.addEdge(1, 0);
        ts.addEdge(1, 4);
        ts.addEdge(4, 3);
        ts.addEdge(3, 2);
        ts.addEdge(4, 5);
        ts.addEdge(5, 7);
        ts.addEdge(6, 3);
        ts.addEdge(6, 7);

        ts.topoSort();

    }
}
