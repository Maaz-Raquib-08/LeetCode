class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int n=0;
            int digit=nums[i];
            while(digit>0){
            n+=digit%10;
            digit=digit/10;
            }
            if(n==i){
                return i;
            }
        }
        return -1;
    }
}