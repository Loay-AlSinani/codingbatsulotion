public int[] frontPiece(int[] nums) {

    if (nums.length <= 2) {
        return nums;
    }


    int[] result = new int[2];
    result[0] = nums[0];
    result[1] = nums[1];

    return result;
}
