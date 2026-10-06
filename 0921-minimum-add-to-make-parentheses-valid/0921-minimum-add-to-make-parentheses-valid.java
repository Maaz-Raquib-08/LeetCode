class Solution {
    public int minAddToMakeValid(String s) {
        int digit=0;
        int n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                digit++;
            }else{
                if(digit>0){
                    digit--;
                }else{
                    n++;
                }
            }
        }
        return digit+n;
    }
}