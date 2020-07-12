package work.jimmmy.prep.exam1;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class  Solutions28 {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null) {
            return -1;
        }

        for (int i = 0; i + needle.length() - 1 < haystack.length(); i++) {
            if (strEquals(haystack, needle, i)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 判断needle是否与haystack以start为开始索引之后的needle长度的字符串相等
     *
     * @param haystack
     * @param needle
     * @param start 外部输入保证start + needle.length - 1 < haystack.length
     * @return
     */
    private boolean strEquals(String haystack, String needle, int start) {
        for (int i = 0; i < needle.length(); i++) {
            if (haystack.charAt(start + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private int BASE = 1000000;

    public int strStr2(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }

        int m = target.length();
        if (m == 0) {
            return 0;
        }

        // 31 ^ m
        int power = 1;
        for (int i = 0; i < m; i++) {
            power = (power * 31) % BASE;
        }

        int targetCode = 0;
        for (int i = 0; i < m; i++) {
            targetCode = (targetCode * 31 + target.charAt(i)) % BASE;
        }

        int hashCode = 0;
        for (int i = 0; i < source.length(); i++) {
            // abc + d
            hashCode = (hashCode * 31 + source.charAt(i)) % BASE;
            if (i < m - 1) {
                continue;
            }

            // abcd - a
            if (i >= m) {
                hashCode = hashCode - (source.charAt(i - m) * power) % BASE;
                if (hashCode < 0) {
                    hashCode += BASE;
                }
            }

            // double check
            if (hashCode == targetCode && source.substring(i - m + 1, i + 1).equals(target)) {
                return i - m + 1;
            }
        }

        return -1;
    }
}
