package work.jimmmy.prep.exam1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringSolutionsTest {

    private StringSolutions solutions;

    @Before
    public void init() {
        this.solutions = new StringSolutions();
    }

    @Test
    public void testCountSubstrings() {
        String test = "abcdef";
        System.out.println("起点、长度维度: " + solutions.countSubstrings1(test));
        System.out.println("起点、终点维度: " + solutions.countSubstrings2(test));
        Assert.assertEquals(solutions.countSubstrings1(test).size(), solutions.countSubstrings2(test).size());
    }
}
