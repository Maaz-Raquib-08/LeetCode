class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        String min="";
        for(int i=0;i<=num.length()-3;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                min=""+num.charAt(i)+num.charAt(i)+num.charAt(i);
            
            if(min.compareTo(max)>0){
                max=min;
            }
        }
            
        }
        return max;
    }
}