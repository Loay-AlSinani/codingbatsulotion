public int sum13(int[] nums) {
    int sum = 0;
    boolean skipNext = false;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 13) {
            skipNext = true;
        } else if (skipNext) {
            skipNext = false;
        } else {
            sum += nums[i];
        }
    }

    return sum;
}
