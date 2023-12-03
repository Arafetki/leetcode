import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();
        int maxValue = maxArray(candies);

        for (int c : candies) {
            if (c + extraCandies >= maxValue) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }

    public int maxArray(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }

        return max;
    }
}