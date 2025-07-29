public boolean twoTwo(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2) {
            boolean hasLeftTwo = (i > 0 && nums[i - 1] == 2);
            boolean hasRightTwo = (i < nums.length - 1 && nums[i + 1] == 2);
            if (!hasLeftTwo && !hasRightTwo) {
                return false;
            }
        }
    }
    return true;
}
