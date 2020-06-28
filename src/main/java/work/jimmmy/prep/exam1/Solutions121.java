package work.jimmmy.prep.exam1;

public class Solutions121 {
    /**
     * 暴力解法
     *
     * i为买入日期，j为卖出日期
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
            }
        }
        return Math.max(maxProfit, 0);
    }
}
