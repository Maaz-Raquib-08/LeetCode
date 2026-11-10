class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hm=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(hm.contains(a)){
                return a;
            }
            hm.add(a);
        }
        return ' ';
    }
}