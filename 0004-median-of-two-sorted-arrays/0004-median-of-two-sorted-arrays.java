class Solution {
    public double findMedianSortedArrays(int[] n, int[] m) {
        int arr[]=new int [n.length+m.length];
        for(int i=0;i<n.length;i++){
            arr[i]=n[i];
        }
        for(int j=0;j<m.length;j++){
            arr[n.length+j]=m[j];
        }
        Arrays.sort(arr);
        if(arr.length%2==1){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        }        
    }
}