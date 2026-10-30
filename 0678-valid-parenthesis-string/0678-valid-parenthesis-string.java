class Solution {
    public boolean checkValidString(String s) {
        int h=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                h--;
                l--;
            }
            else if(s.charAt(i)=='('){
                l++;
                h++;
            }
            else if(s.charAt(i)=='*'){
                l--;
                h++;
            }
            if(h<0){
                return false;
            }
            l=Math.max(l,0);
        }
        return l==0;
    }
}