public int[] pre4(int[] nums) {
    int index = 0;

    while (nums[index] != 4) {
        index++;
    }

    int[] result = new int[index];

    for (int i = 0; i < index; i++) {
        result[i] = nums[i];
    }
    return result;
}
