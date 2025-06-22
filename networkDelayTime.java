import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Build adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] edge : times) {
            graph.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
        }

        // Min-heap: [distance, node]
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, k});

        // Distance map
        Map<Integer, Integer> dist = new HashMap<>();

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0];
            int node = curr[1];

            if (dist.containsKey(node)) continue; // Already visited

            dist.put(node, time);

            // Visit neighbors
            if (graph.containsKey(node)) {
                for (int[] neighbor : graph.get(node)) {
                    int next = neighbor[0], weight = neighbor[1];
                    if (!dist.containsKey(next)) {
                        pq.offer(new int[]{time + weight, next});
                    }
                }
            }
        }

        // If not all nodes are reached
        if (dist.size() < n) return -1;

        // Return the max time among all reachable nodes
        int max = 0;
        for (int time : dist.values()) {
            max = Math.max(max, time);
        }

        return max;
    }
}
