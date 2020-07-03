package work.jimmmy.prep.exam1;

public class Solutions5 {

    public String longestPalindrome1(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int maxLength = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (isPalindrome(substring) && (maxLength < substring.length())) {
                    result = substring;
                    maxLength = substring.length();
                }
            }
        }
        return result;
    }

    public String longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int maxLength = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String oddPalindrome = getLongestPalindrome(str, i, i);
            if (maxLength < oddPalindrome.length()) {
                maxLength = oddPalindrome.length();
                result = oddPalindrome;
            }
            if (i + 1 >= str.length()) {
                continue;
            }
            String evenPalindrome = getLongestPalindrome(str, i, i + 1);
            if (maxLength < evenPalindrome.length()) {
                maxLength = evenPalindrome.length();
                result = evenPalindrome;
            }
        }
        return result;
    }

    /**
     * 判断字符串是否是回文串
     *
     * @param str
     * @return
     */
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 获取长回文串
     *
     * 调用保证参数的有效性
     *
     * @param str
     * @param left
     * @param right
     * @return
     */
    private String getLongestPalindrome(String str, int left, int right) {
        int lp = left;
        int rp = right;

        while (lp >= 0 && rp < str.length()) {
            if (str.charAt(lp) != str.charAt(rp)) {
                return lp + 1 < rp - 1 ? str.substring(lp + 1, rp) : str.substring(left, left + 1);
            }
        }
        return str.substring(lp + 1, rp);
    }
}
