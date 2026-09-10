class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

     int s=0;
     int e=nums.length;
     if(nums.length==1){
        return true;
     }
     int count=0;
        int mid=e/2;
        for(int i=0;i<nums.length;i++){
            if(i!=mid&& nums[i]==nums[mid]){
            return false;
            }
    }
    //     if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
    //         return true;
    //  }   
     return true;
    }
}