package work.jimmmy.prep.exam1;

public class Solutions125 {
    // 双指针，从左边起选有效字符，从右边起选有效字符，依次进行比较
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        int left = 0; // left index
        int right = s.length() - 1; // right index

        while (left < right) {
            // 从左起，找到左边的有效字符
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // 从右起，找到右边的有效字符
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            // 更新比较完后的索引  （当left，right已经不合法时，修改也不会造成影响）
            left++;
            right--;
        }

        return true;
    }
}
