class Solution {
    public int findDuplicate(int[] nums) {
        int s = 1;
        int e = nums.length - 1;
        while (s < e) {
            int count = 0;
            int mid = s + (e - s) / 2;
            for (int i = 0; i < nums.length; i++) {
                if (mid >= nums[i]) {
                    count++;
                }
            }
            if (count > mid) {
                e = mid;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }
}