class Solution {
    public int minMoves(int[] nums) {
       int n=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            n=Math.max(n,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(n-nums[i]);
        }
        return sum; 
    }
}