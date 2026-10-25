class Solution {
    public int trap(int[] arr) {
        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];
        int trapped=0;
        int waterlevel=0;
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
       rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapped+=waterlevel-arr[i];
        }
        return trapped;
    }
}