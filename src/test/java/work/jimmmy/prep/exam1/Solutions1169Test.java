package work.jimmmy.prep.exam1;

import org.junit.Test;

public class Solutions1169Test {
    @Test
    public void test() {
        Solutions1169 s1169 = new Solutions1169();
        String[] transactions = new String[] {
                "alice,20,800,mtv",
                "alice,50,100,beijing",
                "alice,60,100,beijing",
                "wang,50,100,beijing",
                "liu,150,1000,jiujiang",
                "alice,160,10000,suzhou",
                "alice,170,1000,suzhou"
        };
        System.out.println(s1169.invalidTransactions(transactions));
    }
}
