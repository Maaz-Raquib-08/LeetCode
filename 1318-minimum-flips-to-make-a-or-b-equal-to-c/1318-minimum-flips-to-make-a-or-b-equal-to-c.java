class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while (a != 0 || b != 0 || c != 0) {
            int aa = a & 1;
            int bb = b & 1;
            int cc = c & 1;
            if (cc == 1) {
                if ((aa | bb) == 0) {
                    count++;
                }
            } else {
                if (aa == 1) {
                    count++;
                }
                if (bb == 1) {
                    count++;
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return count;
    }
}