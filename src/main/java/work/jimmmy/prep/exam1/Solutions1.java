package work.jimmmy.prep.exam1;

import javafx.util.Pair;

import java.util.Arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solutions1 {
    // 哈希表写法 n^2
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[] {-1, -1};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }
        return new int[] {-1, -1};
    }

    // 双指针算法, :wqnlogn
    public int[] twoSumWithTwoPointers(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[] {-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;
        Pair<Integer, Integer>[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair<Integer, Integer>(nums[i], i);
        }
        Arrays.sort(pairs, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if (o1 == o2) {
                    return 0;
                }
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        while (left < right) {
            if (pairs[left].getKey() > target - pairs[right].getKey()) {
                // nums[left] + nums[right] > target
                right--;
            } else if (pairs[left].getKey() < target - pairs[right].getKey() ) {
                // nums[left] + nums[right] < target
                left++;
            } else {
                return new int[] {pairs[left].getValue(), pairs[right].getValue()};
            }
        }

        return new int[] {-1, -1};
    }
}
