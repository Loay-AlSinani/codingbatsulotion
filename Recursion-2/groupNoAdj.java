public boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) {
        return target == 0;
    }

    boolean include = groupNoAdj(start + 2, nums, target - nums[start]);

    boolean exclude = groupNoAdj(start + 1, nums, target);
    return include || exclude;
}