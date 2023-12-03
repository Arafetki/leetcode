class Solution {
    public String reverseVowels(String s) {
        char[] chArr = s.toCharArray();
        int i = 0;
        int j = chArr.length - 1;

        while (i < j) {
            if (isVowel(chArr[i]) && isVowel(chArr[j])) {
                char ch = chArr[i];
                chArr[i] = chArr[j];
                chArr[j] = ch;
                i++;
                j--;
            }

            if (!isVowel(chArr[i])) {
                i++;
            }
            if (!isVowel(chArr[j])) {
                j--;
            }
        }

        return new String(chArr);
    }

    public boolean isVowel(char ch) {
        char lch = Character.toLowerCase(ch);
        if (lch == 'a' || lch == 'e' || lch == 'i' || lch == 'o' || lch == 'u') {
            return true;
        }
        return false;
    }
}