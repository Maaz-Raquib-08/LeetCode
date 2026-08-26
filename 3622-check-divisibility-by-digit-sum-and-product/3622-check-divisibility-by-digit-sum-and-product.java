class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        int all=sum+product;
        if(m%all==0){
        return true;
        }
        return false;
    }
}