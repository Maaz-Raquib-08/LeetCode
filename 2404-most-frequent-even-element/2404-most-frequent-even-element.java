class Solution {
    public int mostFrequentEven(int[] nums) {
        int freq []=new int[100001];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            freq[nums[i]]++;
            }
        }
            int max=0;
            int n=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                n=i;
            }
        }
        return n;
    }
}