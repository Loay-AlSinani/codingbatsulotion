public boolean canBalance(int[] nums) {
    int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }

    int leftSum = 0;
    for (int num : nums) {
        leftSum += num;
        if (leftSum == totalSum - leftSum) {
            return true;
        }
    }
    return false;
}