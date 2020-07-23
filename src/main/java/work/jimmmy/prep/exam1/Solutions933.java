package work.jimmmy.prep.exam1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * RecentCounter
 */
public class Solutions933 {
    private Queue<Integer> queue;

    public Solutions933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        int start = Math.max(t - 3000, 0);
        queue.add(t);
        while (queue.peek() < start) {
            queue.poll();
        }
        return queue.size();
    }
}
