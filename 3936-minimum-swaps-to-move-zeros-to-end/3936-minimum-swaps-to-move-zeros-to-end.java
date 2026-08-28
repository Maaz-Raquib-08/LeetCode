class Solution {
    public int minimumSwaps(int[] nums) {
        int s=0;
        int count=0;
        int e=nums.length-1;
        while(s<e){
            if(nums[s]==0&&nums[e]!=0){
                int temp=nums[e];
                nums[e]=nums[s];
                nums[s]=temp;
                count++;
                 s++;
                 e--;
            }else{
                if(nums[s]!=0)
                s++;
                if(nums[e]==0)
                 e--;
            }
           
        }
        return count;

    }
}