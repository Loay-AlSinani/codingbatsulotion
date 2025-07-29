public boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) {
        return target == 0;
    }


    int end = start;
    while (end < nums.length && nums[end] == nums[start]) {
        end++;
    }
    int count = end - start;


    if (groupSumClump(end, nums, target - count * nums[start])) {
        return true;
    }


    return groupSumClump(end, nums, target);
}