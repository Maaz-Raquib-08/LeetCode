class Solution {
    public int findClosestNumber(int[] nums) {
        int m=nums[0];
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=Math.abs(nums[i]);
            if(n<Math.abs(m)){
                m=nums[i];
            }else if(n==Math.abs(m)&& nums[i]>m){
                    m=nums[i];
            }
            
            }
            return m;
    }
}