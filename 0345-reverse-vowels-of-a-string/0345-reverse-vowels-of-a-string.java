class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l=0;
        int f=s.length()-1;
        while(l<f){
            while(l<f&&sb.charAt(l)!='a'&&sb.charAt(l)!='A'&&sb.charAt(l)!='i'&&sb.charAt(l)!='I'&&sb.charAt(l)!='O'&&sb.charAt(l)!='o'&&sb.charAt(l)!='E'&&sb.charAt(l)!='e'&&sb.charAt(l)!='u'&&sb.charAt(l)!='U'){
                    l++;
            }
            while(l<f&&sb.charAt(f)!='a'&&sb.charAt(f)!='A'&&sb.charAt(f)!='i'&&sb.charAt(f)!='I'&&sb.charAt(f)!='O'&&sb.charAt(f)!='o'&&sb.charAt(f)!='E'&&sb.charAt(f)!='e'&&sb.charAt(f)!='u'&&sb.charAt(f)!='U'){
                    f--;;
            }
            if(l<f){
                char temp=sb.charAt(l);
                sb.setCharAt(l,sb.charAt(f));
                sb.setCharAt(f,temp);
                l++;
                f--;
            }
        }
        return sb.toString();
    }
}