class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] sq = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sq[i] = 1L * nums[i] * nums[i];
        }

        Arrays.sort(sq);

        long ans = 0;
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            ans -= sq[i];
        }

        for (int i = n / 2; i < n; i++) {
            ans += sq[i];
        }

        return ans;
    }
}