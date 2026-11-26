class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int m=10;
        boolean alice=true;
        while(m>0){
            if(n<m){
                return !alice;
            }
                n-=m;
                m--;
                alice= !alice;
        }
        return false;
    }
}