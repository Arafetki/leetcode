import java.util.Map;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        if (n == 1)
            return ans;
        HashMap<Integer, Integer> cntmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cntmap.put(nums[i], cntmap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : cntmap.entrySet()) {
            if (entry.getValue() > n / 2) {
                ans = entry.getKey();
                break;
            }
        }

        return ans;

    }
}