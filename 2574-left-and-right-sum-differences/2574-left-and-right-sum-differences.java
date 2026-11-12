class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        int leftSum = 0;
        int n = nums.length;
        int[] answer = new int[n];
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return answer;
    }
}