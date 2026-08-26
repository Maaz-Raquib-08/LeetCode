class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0; 
        int j = nums.length;
        while(i<nums.length-1){
            j--;
            if(j==i){
                i++;
                j=nums.length;
                continue;
            }
            if(nums[i]+nums[j] == target){
                res[0] = i;
                res[1] = j;
                break;
            }
            
        } 
        return res;
    }
}   
    