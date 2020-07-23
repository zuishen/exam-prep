package work.jimmmy.prep.exam1;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.*;

/**
 * Invalid Transactions
 */
public class Solutions1169 {
    public List<String> invalidTransactions(String[] transactions) {
        if (transactions == null || transactions.length == 0) {
            return new ArrayList<>(0);
        }
        List<String> result = new LinkedList<>();
        Transaction[] transactionArray = new Transaction[transactions.length];
        // 组装对象
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = new Transaction(transactions[i]);
            transactionArray[i] = transaction;
        }
        // 按时间排序
        Arrays.sort(transactionArray, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                if (o1 == o2) {
                    return 0;
                }
                if (o1.time == o2.time) {
                    return 0;
                }
                return o1.time > o2.time ? 1 : -1;
            }
        });
        int i = 0;
        int j = 0;
        while (j < transactionArray.length) {
            // 保证区间时间小于60mins 或i交易已无效
            if (transactionArray[j].time - transactionArray[i].time >= 60 || !transactionArray[i].isValid) {
                i++;
                continue;
            }
            if (transactionArray[j].amount > 1000) {
                result.add(transactionArray[j].toString());
                transactionArray[j].isValid = false;
            } else if (transactionArray[j].name.equals(transactionArray[i].name)
                    && !transactionArray[j].city.equals(transactionArray[i].city)) {
                // 60 mins内同名且不同城市交易无效
                result.add(transactionArray[i].toString());
                transactionArray[i].isValid = false;
                result.add(transactionArray[j].toString());
                transactionArray[j].isValid = false;
            }
            j++;
        }
        return result;
    }

    private static class Transaction {
        String name;

        int time;

        int amount;

        String city;

        boolean isValid = true;

        Transaction(String tranStr) {
            String[] transAttr = tranStr.split(",");
            this.name = transAttr[0];
            this.time = Integer.parseInt(transAttr[1]);
            this.amount = Integer.parseInt(transAttr[2]);
            this.city = transAttr[3];
        }

        @Override
        public String toString() {
            return name + "," + time + "," + amount + "," + city;
        }
    }
}
