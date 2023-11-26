class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int x = 1; x < nums.length; x++) {
            if (nums[x] != nums[k]) {
                nums[++k] = nums[x];
            }
        }
        return k + 1;
    }
}