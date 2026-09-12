class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []freq=new int[101];
        int maxf=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(maxf<freq[i]){
                maxf=freq[i];
            }
        }
       for(int i=0;i<freq.length;i++){
        if(maxf==freq[i]){
            total+=freq[i];
        }
       }
       return total;
    }
}