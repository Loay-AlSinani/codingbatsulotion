public boolean has12(int[] nums) {
    boolean foundOne = false;
    for (int num : nums) {
        if (num == 1) {
            foundOne = true;
        } else if (foundOne && num == 2) {
            return true;
        }
    }
    return false;
}
