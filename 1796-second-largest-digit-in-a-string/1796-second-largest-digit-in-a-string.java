class Solution {
    public int secondHighest(String s) {
        int n=-1;
        int sn=-1;
        String number=s.replaceAll("[^0-9]","");
        for(int i=number.length()-1;i>=0;i--){
            int digit=number.charAt(i)-'0';
            if(digit>n){
                sn=n;
                n=digit;
            }else if (digit < n && digit > sn) {
                    sn= digit;
        }
        }
        return sn;
    }
}