class Solution {
    public void merge(int []nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        merge(nums,low,mid);
        merge(nums,mid+1,high);
        mergesort(nums,low,high,mid);
    }
    public void mergesort(int []nums,int low,int high,int mid){
        int []temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=high){
            temp[k++]=nums[j++];
        }
            for(k=0,i=low;k<temp.length;k++,i++){
                nums[i]=temp[k];
            }
    }
    public int[] sortArray(int[] nums) {
        int low=0;
         int high=nums.length-1;
          merge(nums,low,high);
          return nums;
    }
}