public boolean split53(int[] nums) {
    return splitHelper(nums, 0, 0, 0);
}

private boolean splitHelper(int[] nums, int index, int sum5, int sum3) {
    if (index == nums.length) {
        return sum5 == sum3;
    }

    int num = nums[index];
    if (num % 5 == 0) {

        return splitHelper(nums, index + 1, sum5 + num, sum3);
    } else if (num % 3 == 0) {

        return splitHelper(nums, index + 1, sum5, sum3 + num);
    } else {

        return splitHelper(nums, index + 1, sum5 + num, sum3)
                || splitHelper(nums, index + 1, sum5, sum3 + num);
    }
}