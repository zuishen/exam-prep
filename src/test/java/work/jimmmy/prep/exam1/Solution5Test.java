package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

public class Solution5Test {
    private Solutions5 solutions5;

    @Before
    public void init() {
        solutions5 = new Solutions5();
    }

    @Test
    public void testBruteForce() {
        String input = "abcacbadf";
        System.out.println(solutions5.longestPalindrome(input));
    }
}
