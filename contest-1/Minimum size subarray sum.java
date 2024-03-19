class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLength = Math.min(minLength, i - j + 1);
                sum=sum+nums[j];
                j++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}