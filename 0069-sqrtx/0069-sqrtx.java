class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int s=0;
        int e=x;
        int n=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            long sq = (long) mid * mid;
            if(sq==x){
                return mid;
                
            }
            else if(sq<x){
                n=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }  
        return n;         
    }
}