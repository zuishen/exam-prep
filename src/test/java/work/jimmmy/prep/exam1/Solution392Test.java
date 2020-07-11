package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

public class Solution392Test {
    private Solutions392 solutions392;

    @Before
    public void init() {
        solutions392 = new Solutions392();
    }

    @Test
    public void test1() {
        String t = "ahbaagdac";
        String s1 = "aca";
        String s2 = "abcd";
        String s3 = "auc";
        System.out.println(solutions392.isSubsequence(s1, t));
        System.out.println(solutions392.isSubsequence(s2, t));
        System.out.println(solutions392.isSubsequence(s3, t));
        System.out.println(solutions392.isSubsequence("", t));
        System.out.println(solutions392.isSubsequence("", ""));
        System.out.println(solutions392.isSubsequence(s1, ""));
    }
}
