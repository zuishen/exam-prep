package work.jimmmy.prep.exam1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringSolutions {


    /**
     * 以起点，长度为维度
     *
     * @param str
     * @return
     */
    public List<String> countSubstrings1(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        List<String> result = new LinkedList<>();
        // i 为子串的长度
        for (int i = 1; i <= str.length(); i++) {
            // j为起始index，i为长度，j，i字符串索引范围为 0, j + i - 1
            for (int j = 0; j + i - 1< str.length(); j++) {
                // substring [j, i)
                result.add(str.substring(j, j + i));
            }
        }
        return result;
    }

    /**
     * 以起点，终点为维度
     *
     * @param str
     * @return
     */
    public List<String> countSubstrings2(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        List<String> result = new LinkedList<>();
        // i 为子串的起点索引
        for (int i = 0; i < str.length(); i++) {
            // j为子串的终点索引
            for (int j = i; j < str.length(); j++) {
                // substring [j, i)
                result.add(str.substring(i, j + 1));
            }
        }
        return result;
    }
}
