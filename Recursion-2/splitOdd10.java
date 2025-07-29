public boolean splitOdd10(int[] nums) {
    return splitHelper(nums, 0, 0, 0);
}

private boolean splitHelper(int[] nums, int index, int sum10, int sumOdd) {
    if (index == nums.length) {
        return (sum10 % 10 == 0) && (sumOdd % 2 == 1);
    }

    if (splitHelper(nums, index + 1, sum10 + nums[index], sumOdd)) {
        return true;
    }

    return splitHelper(nums, index + 1, sum10, sumOdd + nums[index]);
}