class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder m=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char first = m.charAt(0);
            m.deleteCharAt(0);
            m.append(first);
            
            if(m.toString().equals(goal)){
                return true;
            }
        }
            return false;
    }
}