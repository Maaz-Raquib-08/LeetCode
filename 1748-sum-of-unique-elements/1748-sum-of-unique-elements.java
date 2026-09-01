class Solution {
    public int sumOfUnique(int[] nums) {
        int count=0;
        Arrays.sort(nums);
      
        for(int i=0;i<nums.length;i++){
              boolean unique=true;
            if(i>0 && nums[i]==nums[i-1]){
                unique=false;
            }
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                unique=false;
            }
            if(unique){
                count+=nums[i];
            }
        }
        return count;
    }
}