package work.jimmmy.prep.exam1;

public class Solutions5 {

    public String longestPalindrome(String str) {
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

    private String getLongestPalindrome(String str, int left, int right) {
        return "";
    }
}
