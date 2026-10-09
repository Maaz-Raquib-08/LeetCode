class Solution {
    public int minInsertions(String s) {
        int digit=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                m++;
            }
            else{
                if(i+1<s.length()&&s.charAt(i+1)==')'){
                    i++;
                    }else{
                digit++;
                }
                if(m > 0){
                    m--;
                }else{
                    digit++;
                }
            }   
        }
        digit+=m*2;
        return digit;
    }
}