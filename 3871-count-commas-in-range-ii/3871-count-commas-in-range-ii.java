class Solution {
    public long countCommas(long n) {
        long m=0;
        for(long i=1000;i<=n;i*=1000){
            m+=n-i+1;
        }
        return m;
    }
}