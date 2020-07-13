package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

public class Solutions680Test {
    private Solutions680 solutions680;

    @Before
    public void init() {
        solutions680 = new Solutions680();
    }

    @Test
    public void test() {
        System.out.println(solutions680.validPalindrome("abbcda"));
        System.out.println(solutions680.validPalindrome(""));
        System.out.println(solutions680.validPalindrome("aba"));
        System.out.println(solutions680.validPalindrome("abac"));
        System.out.println(solutions680.validPalindrome("abcaba"));
    }
}
