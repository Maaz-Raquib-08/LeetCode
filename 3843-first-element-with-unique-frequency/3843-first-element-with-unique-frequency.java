class Solution {
    public int firstUniqueFreq(int[] nums) {
        int freq[]=new int [100001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int freqcount[]=new int[100001];
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0)
             freqcount[freq[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            int n=freq[nums[i]];
            if(freqcount[n]==1){
                return nums[i];
            }
        }
        return -1;
    }
}