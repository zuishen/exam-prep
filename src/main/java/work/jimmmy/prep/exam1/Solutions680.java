package work.jimmmy.prep.exam1;

public class Solutions680 {
    public boolean validPalindrome(String s) {
        if (s == null) {
            return false;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left++;
            right--;
        }

        return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
    }

    private boolean isPalindrome(String s, int left, int right) {
        if (s == null) {
            return false;
        }

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
