class Solution {
    public int longestValidParentheses(String s) {
        Stack <Integer> m=new Stack<>();
        m.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
            m.push(i);
            }else{
                m.pop();
            }
            if(m.isEmpty()){
                m.push(i);
            }else{
                max=Math.max(max,i-m.peek());
            }
        }
        return max;
    }
}