class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        int idx1 = -1,idx2 = -1;
        int mid;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                idx1 = mid;
                hi = mid - 1;
            }
            else if(nums[mid]>target) hi = mid - 1;
            else lo = mid + 1;
        }
        lo = 0;hi = nums.length-1;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                idx2 = mid;
                lo = mid + 1;
            }
            else if(nums[mid]>target) hi = mid - 1;
            else lo = mid + 1;
        }
        int[] arr = {idx1,idx2};
        return arr;
    }
}