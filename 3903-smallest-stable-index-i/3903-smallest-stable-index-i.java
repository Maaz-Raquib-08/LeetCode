class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
       
        for(int i=0;i<nums.length;i++){
         max=Math.max(max,nums[i]); 
         int min=nums[i];
         for(int j=i;j<nums.length;j++){
         min=Math.min(min,nums[j]);
         }
        
        // for (int i = 0; i < nums.length; i++) {
            int instability = max -min;
            if (instability <= k) {
                return i; 
            }
            }
        return -1;
    }
}