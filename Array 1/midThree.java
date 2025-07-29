public int[] midThree(int[] nums) {

    int mid = nums.length / 2;


    int[] result = new int[3];


    result[0] = nums[mid - 1];
    result[1] = nums[mid];
    result[2] = nums[mid + 1];


    return result;
}
