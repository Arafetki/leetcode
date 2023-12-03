class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        String sum = str1 + str2;
        if (!sum.equals(str2 + str1)) {
            return "";
        }

        if (n > m) {
            return str1.substring(0, gcd(n, m));
        } else {
            return str2.substring(0, gcd(m, n));
        }

    }

    public int gcd(int x, int y) {

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        return x;
    }
}