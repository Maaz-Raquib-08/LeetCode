class Solution {
    public String addSpaces(String s, int[] spaces) {
        int j=0;
        StringBuilder m= new StringBuilder(s.length()+spaces.length);
        for(int i=0;i<s.length();i++){
            if(j<spaces.length&&i==spaces[j]){
                m.append(' ');
                j++;
                m.append(s.charAt(i));
            }
            else{
                m.append(s.charAt(i));
            }
        }
        return m.toString();
    }
}