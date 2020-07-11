package work.jimmmy.prep.exam1;

public class Solutions392 {

    public boolean isSubsequence(String s, String t) {
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            while (j < t.length() && s.charAt(i) != t.charAt(j)) {
                j++;
            }
            if (j >= t.length()) {
                return false;
            }
        }
        return true;
    }
}
