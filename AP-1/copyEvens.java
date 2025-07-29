public int[] copyEvens(int[] nums, int count) {
    int[] result = new int[count];
    int index = 0;

    for (int num : nums) {
        if (num % 2 == 0 && index < count) {
            result[index] = num;
            index++;
        }
    }

    return result;
}