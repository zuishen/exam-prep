package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

public class Solutions28Test {
    private Solutions28 solutions28;

    @Before
    public void init() {
        solutions28 = new Solutions28();
    }

    @Test
    public void test() {
        System.out.println(solutions28.strStr("c", "c"));
        System.out.println(solutions28.strStr("abcdeea", "dee"));
        System.out.println(solutions28.strStr("", "a"));
        System.out.println(solutions28.strStr("abc", ""));
        System.out.println(solutions28.strStr("abcdedf", "acdef"));
        System.out.println(solutions28.strStr("ac", "acd"));
    }
}
