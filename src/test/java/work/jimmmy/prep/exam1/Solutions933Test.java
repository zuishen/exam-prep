package work.jimmmy.prep.exam1;

import org.junit.Test;

import java.util.Arrays;

public class Solutions933Test {
    @Test
    public void test() {
        Solutions933 s933 = new Solutions933();
        System.out.println(s933.ping(1));
        System.out.println(s933.ping(100));
        System.out.println(s933.ping(3000));
        System.out.println(s933.ping(3002));
        System.out.println(s933.ping(3003));
    }
}
