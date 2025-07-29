public int[] makeMiddle(int[] nums) {

    int mid = nums.length / 2;


    int[] result = {nums[mid - 1], nums[mid]};

    return result;
}
