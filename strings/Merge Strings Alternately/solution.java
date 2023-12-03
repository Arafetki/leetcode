class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();
        char[] res = new char[n + m];
        int i = 0;
        int k = 0;
        while (i < n && i < m) {
            res[k] = word1.charAt(i);
            res[k + 1] = word2.charAt(i);
            i++;
            k += 2;
        }

        while (i < n) {
            res[k++] = word1.charAt(i++);
        }
        while (i < m) {
            res[k++] = word2.charAt(i++);
        }

        return new String(res);
    }
}