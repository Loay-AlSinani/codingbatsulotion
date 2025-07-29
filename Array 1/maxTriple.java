public int maxTriple(int[] nums) {
    int first = nums[0];
    int middle = nums[nums.length / 2];
    int last = nums[nums.length - 1];


    int max = first;

    if (middle > max) {
        max = middle;
    }
    if (last > max) {
        max = last;
    }

    return max;
}
