class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        
        }
        for(int j=0;j<=nums.length-1;j++){
            int m=sum-n-nums[j];
            if(n==m){
                return j;
            }
            n+=nums[j];
        }
        return -1;
    }
}