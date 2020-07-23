package work.jimmmy.prep.exam1;

import org.junit.Test;

public class Solutions622Test {
    @Test
    public void test() {
        // 为零，检查为空返回值，队列满情况
        Solutions622 circularQueue = new Solutions622(0); // 设置长度为 3
        System.out.println(circularQueue.enQueue(1)); // 返回 true
        System.out.println(circularQueue.enQueue(2)); // 返回 true
        System.out.println(circularQueue.enQueue(3)); // 返回 true
        System.out.println(circularQueue.enQueue(4)); // 返回 false，队列已满
        System.out.println(circularQueue.Rear()); // 返回 3
        System.out.println(circularQueue.isFull()); // 返回 true
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println(circularQueue.enQueue(4)); // 返回 true
        System.out.println(circularQueue.Rear()); // 返回 4

        System.out.println("--------------------------------------------------");

        // 检查是否循环，数组是否会越界
        Solutions622 circularQueue1 = new Solutions622(0); // 设置长度为 3
        System.out.println(circularQueue1.enQueue(1)); // 返回 true
        System.out.println(circularQueue1.enQueue(2)); // 返回 true
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println(circularQueue1.enQueue(1)); // 返回 true
        System.out.println(circularQueue1.enQueue(2)); // 返回 true
        System.out.println(circularQueue1.enQueue(3)); // 返回 true
        System.out.println(circularQueue1.enQueue(4)); // 返回 false，队列已满
        System.out.println(circularQueue.Rear()); // 返回 3
        System.out.println(circularQueue.isFull()); // 返回 true
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println(circularQueue.enQueue(4)); // 返回 true
        System.out.println(circularQueue.Rear()); // 返回 4
    }
}
