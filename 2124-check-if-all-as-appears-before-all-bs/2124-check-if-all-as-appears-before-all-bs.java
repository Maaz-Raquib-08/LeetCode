// class Solution {
//     public boolean checkString(String s) {
//         int n=-1;
//         int b=-1;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='b'&& b == -1){
//                 b=i; 
//             }if(s.charAt(i)=='a'){
//                 n=i;
//             }

//         }
//         if(b != -1 && n != -1 && b < n){
//             return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean checkString(String s) {
        boolean b = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                b = true;
            }

            if (s.charAt(i) == 'a' && b) {
                return false;
            }
        }

        return true;
    }
}
