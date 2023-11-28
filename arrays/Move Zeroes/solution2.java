class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[p] == 0 && nums[i] != 0) {
                nums[p] = nums[p] + nums[i];
                nums[i] = nums[p] - nums[i];
                nums[p] = nums[p] - nums[i];
                p++;
            }
            if (nums[p] != 0) {
                p++;
            }
        }

    }
}