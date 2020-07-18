package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solutions1Test {
    private Solutions1 solutions1;

    @Before
    public void init() {
        solutions1 = new Solutions1();
    }

    @Test
    public void test() {
        int[] test = new int[] {2, 1, 0};
        System.out.println(Arrays.toString(solutions1.twoSum(test, 4)));
        System.out.println(Arrays.toString(solutions1.twoSumWithTwoPointers(test, 4)));

        int[] test1 = new int[] {2, 7, 11, 15};
        System.out.println(Arrays.toString(solutions1.twoSum(test1, 13)));
        System.out.println(Arrays.toString(solutions1.twoSumWithTwoPointers(test1, 13)));

        int[] test2 = new int[] {3,2,4};
        System.out.println(Arrays.toString(solutions1.twoSum(test2, 6)));
        System.out.println(Arrays.toString(solutions1.twoSumWithTwoPointers(test2, 6)));
    }
}
