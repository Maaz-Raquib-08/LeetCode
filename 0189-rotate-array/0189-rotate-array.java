class Solution {
    public void rotate(int[] nums, int k) {
        int n[]=new int [nums.length];
        int m=nums.length;
        for(int i=0;i<m;i++){
            n[(i + k) % m]=nums[i];
            

        }
            for(int i=0;i<m;i++){
                nums[i]=n[i];
            }
    }
}
