class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int x = 2; x < nums.length; x++) {
            if (nums[x] != nums[k - 2]) {
                nums[k] = nums[x];
                k++;
            }
        }
        return k;

    }
}