import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        long mod = 1000000007L;
        long result = 0;

        Map<Integer, Long> left = new HashMap<>();
        Map<Integer, Long> right = new HashMap<>();

        // Build right frequency map
        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0L) + 1);
        }

        // Iterate each index j as the middle element
        for (int j = 0; j < nums.length; j++) {
            right.put(nums[j], right.get(nums[j]) - 1);
            if (right.get(nums[j]) == 0) {
                right.remove(nums[j]);
            }

            int target = nums[j] * 2;

            long leftCount = left.getOrDefault(target, 0L);
            long rightCount = right.getOrDefault(target, 0L);

            result = (result + (leftCount * rightCount) % mod) % mod;

            left.put(nums[j], left.getOrDefault(nums[j], 0L) + 1);
        }

        return (int) result;
    }
}