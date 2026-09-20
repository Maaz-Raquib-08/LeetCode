class Solution {
    public int reverseDegree(String s) {
        int n=122;
        int total=0;
        for(int i=0;i<s.length();i++){
            int m=n-s.charAt(i)+1;
            total+=m*(i+1);
        }
            return total;
    }
}