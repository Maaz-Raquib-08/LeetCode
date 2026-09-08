class Solution {
    public int countCommas(int n) {
        int m=0;
        if(999>=n){
            return 0;
        }
        else{
             m=n-999;
        }
        return m;
    }
}