class Solution {
    public String finalString(String s) {
        StringBuilder m=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                m.append(s.charAt(i));
            }
            else{
                m.reverse();
            }
        }
        return m.toString();
    }
}