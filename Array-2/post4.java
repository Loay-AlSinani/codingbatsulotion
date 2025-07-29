public int[] post4(int[] nums) {
    int lastIndex = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            lastIndex = i;
        }
    }

    int length = nums.length - lastIndex - 1;
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
        result[i] = nums[lastIndex + 1 + i];
    }
    return result;
}
