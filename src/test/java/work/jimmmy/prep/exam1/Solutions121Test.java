package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

public class Solutions121Test {
    private Solutions121 s121;

    @Before
    public void init() {
        s121 = new Solutions121();
    }

    @Test
    public void test1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("test1 for s1: " + s121.maxProfit(prices));
        System.out.println("test1 for s2: " + s121.maxProfit1(prices));
    }

    @Test
    public void test2() {
        int[] prices = {5, 4, 3, 2, 1};
        System.out.println("test2 for s1: " + s121.maxProfit(prices));
        System.out.println("test2 for s2: " + s121.maxProfit1(prices));
    }
}
