class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int maxSum = nums[0];
        int currMax = 0;

        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            // Standard Kadane (max subarray)
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Min subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            totalSum += num;
        }

        // Edge case: all elements negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Return max of both cases
        return Math.max(maxSum, totalSum - minSum);
    }
}