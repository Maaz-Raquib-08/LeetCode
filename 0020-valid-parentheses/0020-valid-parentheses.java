// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> a = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//                 a.push(s.charAt(i));
//             } else if (s.charAt(i) == ')') {
//                 if (a.isEmpty()) {
//                     return false;
//                 }
//                 if (a.peek() == '(') {
//                     a.pop();
//                 } else {
//                     return false;
//                 }
//             } else if (s.charAt(i) == '}') {
//                 if (a.isEmpty()) {
//                     return false;
//                 }
//                 if (a.peek() == '{') {
//                     a.pop();
//                 } else {
//                     return false;
//                 }
//             } else if (s.charAt(i) == ']') {
//                 if (a.isEmpty()) {
//                     return false;
//                 }
//                 if (a.peek() == '[') {
//                     a.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }
//         return a.isEmpty();
//     }
// }
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}