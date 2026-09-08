class Solution {
    public int countCommas(int n) {
        // int m=0;
        // if(999>=n){
        //     return 0;
        // }
        // else{
        //      m=n-999;
        // }
        // return m;
        if(n<1000){
            return 0;
        }
        return n-999;
    }
}