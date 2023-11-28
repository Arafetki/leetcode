import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!mp.containsKey(ch)) {
                return false;
            }
            mp.put(ch, mp.get(ch) - 1);
        }

        for (int v : mp.values()) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}