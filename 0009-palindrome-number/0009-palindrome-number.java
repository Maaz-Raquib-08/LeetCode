class Solution {
    public boolean isPalindrome(int x) {
            int b=x;
           int rev=0;
            while (b!= 0) {
            int digit = b % 10;   
            rev = rev * 10 + digit; 
            b = b / 10;         
        }
        if (rev!=x||x<0){
            return false;
        }
        return true;
    }
}