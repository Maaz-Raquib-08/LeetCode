class Solution {
    public int findDuplicate(int[] nums) {
        // int s = 1;
        // int e = nums.length - 1;
        // while (s < e) {
        //     int count = 0;
        //     int mid = s + (e - s) / 2;
        //     for (int i = 0; i < nums.length; i++) {
        //         if (mid >= nums[i]) {
        //             count++;
        //         }
        //     }
        //     if (count > mid) {
        //         e = mid;
        //     } else {
        //         s = mid + 1;
        //     }

        // }
        // return s;
        int freq[]=new int[100001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                return i;
            }
            
        }
        return -1;
    }
}