package work.jimmmy.prep.exam1;

import org.junit.Before;
import org.junit.Test;

public class Solutions125Test {
    private Solutions125 solutions125;

    @Before
    public void init() {
        solutions125 = new Solutions125();
    }

    @Test
    public void test125() {
        System.out.println(solutions125.isPalindrome(null));
        System.out.println(solutions125.isPalindrome(""));
        System.out.println(solutions125.isPalindrome("s"));
        System.out.println(solutions125.isPalindrome("ss"));
        System.out.println(solutions125.isPalindrome("sas"));
        System.out.println(solutions125.isPalindrome("sabs"));
        System.out.println(solutions125.isPalindrome("asabs"));
        System.out.println(solutions125.isPalindrome("sabsd"));

        System.out.println(solutions125.isPalindrome("..,,."));
        System.out.println(solutions125.isPalindrome("..a,."));
        System.out.println(solutions125.isPalindrome(".a,a.a"));
        System.out.println(solutions125.isPalindrome(".,0s.a,9.as0"));
    }

}
