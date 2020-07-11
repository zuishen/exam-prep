package work.jimmmy.prep.exam1;

public class Solutions28 {
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
}
